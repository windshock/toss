package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.LruCache;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.core.R;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceSDK {
    private static int IAuthTabCallback = 1;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final FaceSDK onWarmupCompleted = new FaceSDK();
    private static final LruCache<onExtraCallbackWithResult, DecimalFormat> onExtraCallback = new LruCache<>(20);

    public static final /* synthetic */ class IAuthTabCallbackStub {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.KOREAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.ENGLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallback.THAI.ordinal()] = 3;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onExtraCallback.CHINESE_TRADITIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[onExtraCallback.CHINESE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[onExtraCallback.VIETNAMESE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[onExtraCallback.RUSSIAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[onExtraCallback.GERMAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[onExtraCallback.DUTCH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[onExtraCallback.SPANISH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[onExtraCallback.ITALIAN.ordinal()] = 11;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[onExtraCallback.FRENCH.ordinal()] = 12;
                int i3 = onNavigationEvent + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[onExtraCallback.FINNISH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            onWarmupCompleted = iArr;
            int i6 = onNavigationEvent + 21;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    private FaceSDK() {
    }

    public static final /* synthetic */ DecimalFormat IAuthTabCallback(FaceSDK faceSDK, String str, char c, char c2) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return faceSDK.IAuthTabCallback(str, c, c2);
        }
        faceSDK.IAuthTabCallback(str, c, c2);
        throw null;
    }

    public static final /* synthetic */ Pair onExtraCallback(FaceSDK faceSDK, onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Pair<Character, Character> pairOnExtraCallback = faceSDK.onExtraCallback(onextracallback);
        int i4 = onNavigationEvent + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return pairOnExtraCallback;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onWarmupCompleted Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback KOREAN = new onExtraCallback("KOREAN", 0);
        public static final onExtraCallback ENGLISH = new onExtraCallback("ENGLISH", 1);
        public static final onExtraCallback CHINESE = new onExtraCallback("CHINESE", 2);
        public static final onExtraCallback CHINESE_TRADITIONAL = new onExtraCallback("CHINESE_TRADITIONAL", 3);
        public static final onExtraCallback VIETNAMESE = new onExtraCallback("VIETNAMESE", 4);
        public static final onExtraCallback RUSSIAN = new onExtraCallback("RUSSIAN", 5);
        public static final onExtraCallback THAI = new onExtraCallback("THAI", 6);
        public static final onExtraCallback GERMAN = new onExtraCallback("GERMAN", 7);
        public static final onExtraCallback DUTCH = new onExtraCallback("DUTCH", 8);
        public static final onExtraCallback FRENCH = new onExtraCallback("FRENCH", 9);
        public static final onExtraCallback FINNISH = new onExtraCallback("FINNISH", 10);
        public static final onExtraCallback SPANISH = new onExtraCallback("SPANISH", 11);
        public static final onExtraCallback ITALIAN = new onExtraCallback("ITALIAN", 12);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {KOREAN, ENGLISH, CHINESE, CHINESE_TRADITIONAL, VIETNAMESE, RUSSIAN, THAI, GERMAN, DUTCH, FRENCH, FINNISH, SPANISH, ITALIAN};
            int i5 = i3 + 45;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 13;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i2 + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            Companion = new onWarmupCompleted(null);
            int i = onNavigationEvent + 7;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 15 / 0;
            }
        }

        public static final class onWarmupCompleted {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onExtraCallback onExtraCallback(@NotNull Locale locale) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(locale, "");
                String language = locale.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "");
                String lowerCase = language.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                Object obj = null;
                switch (lowerCase.hashCode()) {
                    case 3201:
                        if (lowerCase.equals("de")) {
                            return onExtraCallback.GERMAN;
                        }
                        break;
                    case 3241:
                        if (lowerCase.equals("en")) {
                            return onExtraCallback.ENGLISH;
                        }
                        break;
                    case 3246:
                        if (lowerCase.equals("es")) {
                            return onExtraCallback.SPANISH;
                        }
                        break;
                    case 3267:
                        if (lowerCase.equals("fi")) {
                            return onExtraCallback.FINNISH;
                        }
                        break;
                    case 3276:
                        if (lowerCase.equals("fr")) {
                            int i2 = onNavigationEvent + 103;
                            onExtraCallbackWithResult = i2 % 128;
                            int i3 = i2 % 2;
                            return onExtraCallback.FRENCH;
                        }
                        break;
                    case 3371:
                        if (lowerCase.equals("it")) {
                            int i4 = onNavigationEvent + 35;
                            onExtraCallbackWithResult = i4 % 128;
                            if (i4 % 2 != 0) {
                                return onExtraCallback.ITALIAN;
                            }
                            onExtraCallback onextracallback = onExtraCallback.ITALIAN;
                            obj.hashCode();
                            throw null;
                        }
                        break;
                    case 3428:
                        if (lowerCase.equals("ko")) {
                            return onExtraCallback.KOREAN;
                        }
                        break;
                    case 3518:
                        if (lowerCase.equals("nl")) {
                            return onExtraCallback.DUTCH;
                        }
                        break;
                    case 3651:
                        if (lowerCase.equals("ru")) {
                            int i5 = onExtraCallbackWithResult + 57;
                            onNavigationEvent = i5 % 128;
                            if (i5 % 2 != 0) {
                                onExtraCallback onextracallback2 = onExtraCallback.RUSSIAN;
                                obj.hashCode();
                                throw null;
                            }
                            onExtraCallback onextracallback3 = onExtraCallback.RUSSIAN;
                            int i6 = onExtraCallbackWithResult + 115;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            return onextracallback3;
                        }
                        break;
                    case 3700:
                        if (lowerCase.equals("th")) {
                            return onExtraCallback.THAI;
                        }
                        break;
                    case 3763:
                        if (lowerCase.equals("vi")) {
                            return onExtraCallback.VIETNAMESE;
                        }
                        break;
                    case 3886:
                        if (lowerCase.equals("zh")) {
                            if (!IAuthTabCallback(locale)) {
                                return onExtraCallback.CHINESE;
                            }
                            int i8 = onExtraCallbackWithResult + 1;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            return onExtraCallback.CHINESE_TRADITIONAL;
                        }
                        break;
                    default:
                        int i10 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        break;
                }
                return onExtraCallback.ENGLISH;
            }

            private final boolean IAuthTabCallback(Locale locale) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                return StringsKt.equals(locale.getCountry(), "TW", i2 % 2 == 0);
            }
        }
    }

    static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final char IAuthTabCallback;
        private final char onExtraCallback;
        private final String onNavigationEvent;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.FaceSDK.onExtraCallbackWithResult) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r6 = (o.FaceSDK.onExtraCallbackWithResult) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        
            r6 = o.FaceSDK.onExtraCallbackWithResult.onExtraCallbackWithResult + 23;
            o.FaceSDK.onExtraCallbackWithResult.onWarmupCompleted = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            if (r5.onExtraCallback == r6.onExtraCallback) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        
            r6 = o.FaceSDK.onExtraCallbackWithResult.onWarmupCompleted + 35;
            o.FaceSDK.onExtraCallbackWithResult.onExtraCallbackWithResult = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        
            if (r5.IAuthTabCallback == r6.IAuthTabCallback) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        
            r6 = o.FaceSDK.onExtraCallbackWithResult.onWarmupCompleted + 73;
            o.FaceSDK.onExtraCallbackWithResult.onExtraCallbackWithResult = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((this.onNavigationEvent.hashCode() >>> 125) >> Character.hashCode(this.onExtraCallback)) - 102) << Character.hashCode(this.IAuthTabCallback) : (((this.onNavigationEvent.hashCode() * 31) + Character.hashCode(this.onExtraCallback)) * 31) + Character.hashCode(this.IAuthTabCallback);
            int i3 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FormatterCacheKey(pattern=" + this.onNavigationEvent + ", groupingSeparator=" + this.onExtraCallback + ", decimalSeparator=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull String str, char c, char c2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
            this.onExtraCallback = c;
            this.IAuthTabCallback = c2;
        }
    }

    static {
        int i = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final DecimalFormat IAuthTabCallback(String str, char c, char c2) {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(str, c, c2);
        LruCache<onExtraCallbackWithResult, DecimalFormat> lruCache = onExtraCallback;
        DecimalFormat decimalFormat = (DecimalFormat) lruCache.get(onextracallbackwithresult);
        if (decimalFormat != null) {
            return decimalFormat;
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(c);
        decimalFormatSymbols.setDecimalSeparator(c2);
        DecimalFormat decimalFormat2 = new DecimalFormat(str, decimalFormatSymbols);
        decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
        lruCache.put(onextracallbackwithresult, decimalFormat2);
        int i2 = onNavigationEvent + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return decimalFormat2;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a A[PHI: r1 r3
      0x004a: PHI (r1v10 java.lang.Character) = (r1v5 char), (r1v12 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r3v7 java.lang.Character) = (r3v1 char), (r3v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[PHI: r2 r3
      0x004f: PHI (r2v6 java.lang.Character) = (r2v2 char), (r2v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r3v6 java.lang.Character) = (r3v1 char), (r3v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[PHI: r1 r3
      0x005d: PHI (r1v6 java.lang.Character) = (r1v5 char), (r1v12 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r3v5 java.lang.Character) = (r3v1 char), (r3v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[PHI: r2 r3
      0x0062: PHI (r2v5 java.lang.Character) = (r2v2 char), (r2v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r3v4 java.lang.Character) = (r3v1 char), (r3v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[PHI: r2 r3
      0x0067: PHI (r2v4 java.lang.Character) = (r2v2 char), (r2v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r3v3 java.lang.Character) = (r3v1 char), (r3v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[PHI: r2 r3
      0x006c: PHI (r2v3 java.lang.Character) = (r2v2 char), (r2v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r3v2 java.lang.Character) = (r3v1 char), (r3v9 char) binds: [B:8:0x0046, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Pair<Character, Character> onExtraCallback(onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        char c;
        char c2;
        char c3;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            c = (char) 20;
            c2 = '[';
            c3 = '(';
            switch (IAuthTabCallbackStub.onWarmupCompleted[onextracallback.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return getWrite.IAuthTabCallback(c3, c2);
                case 5:
                    return getWrite.IAuthTabCallback(c3, c2);
                case 6:
                    return getWrite.IAuthTabCallback(c2, c3);
                case 7:
                    return getWrite.IAuthTabCallback(c, c3);
                case 8:
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                case 10:
                case 11:
                    Pair<Character, Character> pairIAuthTabCallback = getWrite.IAuthTabCallback(c2, c3);
                    int i3 = onNavigationEvent + 17;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    return pairIAuthTabCallback;
                case LiveCheckConstants.SVC_U1 /* 12 */:
                case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                    return getWrite.IAuthTabCallback(c, c3);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        c = ' ';
        c2 = '.';
        c3 = ',';
        switch (IAuthTabCallbackStub.onWarmupCompleted[onextracallback.ordinal()]) {
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static short[] asBinder;
        private static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final onNavigationEvent onNavigationEvent;
        private static byte[] onWarmupCompleted;
        private static final byte[] $$a = {8, -40, 43, -43};
        private static final int $$b = 140;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface = 0;

        private static String $$c(short s, short s2, byte b) {
            int i = 115 - (s2 * 3);
            int i2 = s * 3;
            byte[] bArr = $$a;
            int i3 = 3 - (b * 4);
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i = i2 + i;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i;
                if (i4 == i2) {
                    return new String(bArr2, 0);
                }
                i3++;
                i += bArr[i3];
            }
        }

        static {
            IAuthTabCallbackDefault = 1;
            onWarmupCompleted();
            onNavigationEvent = new onNavigationEvent();
            int i = asInterface + 9;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ String IAuthTabCallback(onNavigationEvent onnavigationevent, Number number, Locale locale, Integer num, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 49;
            onTransact = i3 % 128;
            if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            if ((i & 4) != 0) {
                int i4 = IAuthTabCallbackStub + 57;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                num = null;
            }
            String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(number, locale, num);
            int i6 = onTransact + 79;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return strOnExtraCallbackWithResult;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x012e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String onExtraCallbackWithResult(@NotNull Number number, @NotNull Locale locale, @Nullable Integer num) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(locale, "");
            onExtraCallback onExtraCallback2 = onExtraCallback.Companion.onExtraCallback(locale);
            FaceSDK faceSDK = FaceSDK.onWarmupCompleted;
            Pair pairOnExtraCallback = FaceSDK.onExtraCallback(faceSDK, onExtraCallback2);
            char cCharValue = ((Character) pairOnExtraCallback.onExtraCallbackWithResult()).charValue();
            char cCharValue2 = ((Character) pairOnExtraCallback.IAuthTabCallback()).charValue();
            onExtraCallback onextracallback = onExtraCallback.CHINESE;
            Object[] objArr = new Object[1];
            a((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) ExpandableListView.getPackedPositionType(0L), Color.argb(0, 0, 0, 0) + 1703447589, (-2111608044) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-83) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            if (onExtraCallback2 == onextracallback) {
                if (num != null && num.intValue() > 0) {
                    Object[] objArr2 = new Object[1];
                    a((short) TextUtils.getOffsetAfter("", 0), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1703447588, (ViewConfiguration.getJumpTapTimeout() >> 16) - 2111608044, (-82) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                    strIntern = "0." + StringsKt.repeat(((String) objArr2[0]).intern(), num.intValue());
                    int i2 = IAuthTabCallbackStub + 87;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                }
            } else if (num != null) {
                int i4 = onTransact + 121;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                if (num.intValue() > 0) {
                    Object[] objArr3 = new Object[1];
                    a((short) TextUtils.getOffsetAfter("", 0), (byte) View.resolveSizeAndState(0, 0, 0), 1703447589 - ExpandableListView.getPackedPositionGroup(0L), Color.red(0) - 2111608044, (-83) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
                    strIntern = "#,##0." + StringsKt.repeat(((String) objArr3[0]).intern(), num.intValue());
                } else {
                    strIntern = "#,###";
                }
            }
            String str = FaceSDK.IAuthTabCallback(faceSDK, strIntern, cCharValue, cCharValue2).format(number);
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        public static /* synthetic */ String onWarmupCompleted(onNavigationEvent onnavigationevent, String str, Locale locale, Integer num, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i3 = IAuthTabCallbackStub + 119;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                num = null;
            }
            String strOnWarmupCompleted = onnavigationevent.onWarmupCompleted(str, locale, num);
            int i5 = IAuthTabCallbackStub + 49;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return strOnWarmupCompleted;
            }
            obj2.hashCode();
            throw null;
        }

        public final String onWarmupCompleted(@NotNull String str, @NotNull Locale locale, @Nullable Integer num) throws Throwable {
            String strIntern;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(locale, "");
            String string = StringsKt.trim(str).toString();
            boolean z = false;
            Object obj = null;
            boolean zContains$default = StringsKt.contains$default(string, ".", false, 2, (Object) null);
            String strSubstringAfter = StringsKt.substringAfter(string, ".", "");
            BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(string);
            if (bigDecimalOrNull == null) {
                int i2 = IAuthTabCallbackStub + 111;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    return "";
                }
                obj.hashCode();
                throw null;
            }
            onExtraCallback onExtraCallback2 = onExtraCallback.Companion.onExtraCallback(locale);
            FaceSDK faceSDK = FaceSDK.onWarmupCompleted;
            Pair pairOnExtraCallback = FaceSDK.onExtraCallback(faceSDK, onExtraCallback2);
            char cCharValue = ((Character) pairOnExtraCallback.onExtraCallbackWithResult()).charValue();
            char cCharValue2 = ((Character) pairOnExtraCallback.IAuthTabCallback()).charValue();
            if (onExtraCallback2 == onExtraCallback.CHINESE) {
                Object[] objArr = new Object[1];
                a((short) TextUtils.indexOf("", ""), (byte) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 1703447589, View.MeasureSpec.makeMeasureSpec(0, 0) - 2111608044, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 83, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                strIntern = "#,##0";
            }
            DecimalFormat decimalFormatIAuthTabCallback = FaceSDK.IAuthTabCallback(faceSDK, strIntern, cCharValue, cCharValue2);
            if (num != null) {
                strSubstringAfter = StringsKt.take(strSubstringAfter, num.intValue());
            }
            if (zContains$default) {
                int i3 = onTransact + 25;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                if (num == null || num.intValue() > 0) {
                    int i5 = IAuthTabCallbackStub + 107;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(decimalFormatIAuthTabCallback.format(bigDecimalOrNull.toBigInteger()));
            if (z) {
                int i7 = IAuthTabCallbackStub + 53;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                sb.append(cCharValue2);
                sb.append(strSubstringAfter);
            }
            return sb.toString();
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int i6 = 2;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 42 - Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    int i8 = $10;
                    int i9 = i8 + 43;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr = onWarmupCompleted;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i11 = i8 + 59;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 5 % 3;
                        }
                        int i13 = 0;
                        while (i13 < length) {
                            int i14 = $10 + 29;
                            $11 = i14 % 128;
                            int i15 = i14 % i6;
                            Object[] objArr3 = {Integer.valueOf(bArr[i13])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 12844), (Process.myTid() >> 22) + 55, 2167 - (Process.myTid() >> 22), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i13] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i13++;
                            i6 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i16 = $11 + 97;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            byte[] bArr3 = onWarmupCompleted;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43423), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 22439 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] / (-4629411779493505016L))) << ((int) (IAuthTabCallback - (-4629411779493505016L)));
                        } else {
                            byte[] bArr4 = onWarmupCompleted;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 42 - View.getDefaultSize(0, 0), 22439 - (Process.myTid() >> 22), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i5;
                    } else {
                        iIntValue = (short) (((short) (asBinder[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i17 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    if (z) {
                        int i18 = $11 + 45;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i17 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 85, 9567 - (ViewConfiguration.getTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onWarmupCompleted;
                    if (bArr5 != null) {
                        int i20 = $10 + 93;
                        $11 = i20 % 128;
                        int i21 = i20 % 2;
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i22 = 0; i22 < length2; i22++) {
                            bArr6[i22] = (byte) (bArr5[i22] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    boolean z2 = bArr5 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr7 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static void onWarmupCompleted() {
            onExtraCallbackWithResult = 1043377107;
            IAuthTabCallback = -1538795428;
            onExtraCallback = -644133612;
            onWarmupCompleted = new byte[]{8};
        }
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static char[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onWarmupCompleted onWarmupCompleted;

        public static final /* synthetic */ class onExtraCallbackWithResult {
            public static final /* synthetic */ int[] onExtraCallback;
            public static final /* synthetic */ int[] onExtraCallbackWithResult;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int[] iArr = new int[onExtraCallback.values().length];
                try {
                    iArr[onExtraCallback.KRW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallback.AUD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onExtraCallback.USD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[onExtraCallback.CNY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[onExtraCallback.VND.ordinal()] = 5;
                    int i = onNavigationEvent + 87;
                    onWarmupCompleted = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[onExtraCallback.RUB.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[onExtraCallback.THB.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[onExtraCallback.JPY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[onExtraCallback.EUR.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                onExtraCallback = iArr;
                int[] iArr2 = new int[onExtraCallback.values().length];
                try {
                    iArr2[onExtraCallback.ENGLISH.ordinal()] = 1;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[onExtraCallback.THAI.ordinal()] = 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[onExtraCallback.CHINESE_TRADITIONAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[onExtraCallback.GERMAN.ordinal()] = 4;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[onExtraCallback.DUTCH.ordinal()] = 5;
                    int i4 = onNavigationEvent + 15;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr2[onExtraCallback.FRENCH.ordinal()] = 6;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[onExtraCallback.FINNISH.ordinal()] = 7;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr2[onExtraCallback.SPANISH.ordinal()] = 8;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr2[onExtraCallback.ITALIAN.ordinal()] = 9;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[onExtraCallback.KOREAN.ordinal()] = 10;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr2[onExtraCallback.CHINESE.ordinal()] = 11;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr2[onExtraCallback.VIETNAMESE.ordinal()] = 12;
                    int i8 = 2 % 2;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr2[onExtraCallback.RUSSIAN.ordinal()] = 13;
                } catch (NoSuchFieldError unused22) {
                }
                onExtraCallbackWithResult = iArr2;
            }
        }

        static {
            IAuthTabCallback();
            onWarmupCompleted = new onWarmupCompleted();
            int i = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~i4;
            int i9 = i7 | i8;
            int i10 = ~(i9 | i5);
            int i11 = ~i5;
            int i12 = (~(i7 | i4)) | (~(i8 | i11)) | (~(i8 | i));
            int i13 = ~(i11 | i9);
            int i14 = i + i4 + i2 + (1938118820 * i3) + ((-1869228383) * i6);
            int i15 = i14 * i14;
            int i16 = (i * (-1046486968)) + 2037645312 + ((-1046486968) * i4) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i2) + ((-1907359744) * i3) + (1374945280 * i6) + (1516044288 * i15);
            int i17 = ((i * 647972376) - 1941852458) + (i4 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i2 * 647973227) + (i3 * (-1260466036)) + (i6 * 1557372491) + (i15 * 1239351296);
            return i16 + ((i17 * i17) * 490405888) != 1 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            char c;
            int length;
            char[] cArr2;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr3 = onExtraCallback;
            long j = 0;
            if (cArr3 != null) {
                int i6 = $11 + 113;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 35 - View.MeasureSpec.getMode(0), 14240 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, i2, cArr4, 0, i3);
            if (bArr != null) {
                int i8 = $11 + 99;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = $11 + 85;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.green(0)), 65 - (ViewConfiguration.getScrollBarSize() >> 8), 16717 - ImageFormat.getBitsPerPixel(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                Object obj = null;
                                cArr[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                obj.hashCode();
                                throw null;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 10936), 65 - KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 17657 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getLongPressTimeout() >> 16)), ImageFormat.getBitsPerPixel(0) + 71, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr4, 0, cArr5, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr4, i13, i5);
                System.arraycopy(cArr5, i5, cArr4, 0, i13);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr6;
            }
            if (i4 > 0) {
                loop3: while (true) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                        int i14 = $11 + 63;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            break;
                        }
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[4]);
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private onWarmupCompleted() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onExtraCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onExtraCallback[] $VALUES;
            public static final C0013onWarmupCompleted Companion;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            public static final onExtraCallback KRW = new onExtraCallback("KRW", 0);
            public static final onExtraCallback AUD = new onExtraCallback("AUD", 1);
            public static final onExtraCallback USD = new onExtraCallback("USD", 2);
            public static final onExtraCallback CNY = new onExtraCallback("CNY", 3);
            public static final onExtraCallback VND = new onExtraCallback("VND", 4);
            public static final onExtraCallback RUB = new onExtraCallback("RUB", 5);
            public static final onExtraCallback THB = new onExtraCallback("THB", 6);
            public static final onExtraCallback EUR = new onExtraCallback("EUR", 7);
            public static final onExtraCallback JPY = new onExtraCallback("JPY", 8);

            private static final /* synthetic */ onExtraCallback[] $values() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 17;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                onExtraCallback[] onextracallbackArr = {KRW, AUD, USD, CNY, VND, RUB, THB, EUR, JPY};
                int i5 = i3 + 107;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackArr;
            }

            public static EnumEntries<onExtraCallback> getEntries() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
                int i4 = i3 + 123;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return enumEntries;
            }

            public static onExtraCallback valueOf(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
                int i4 = onWarmupCompleted + 39;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return onextracallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static onExtraCallback[] values() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback[] onextracallbackArr = $VALUES;
                if (i3 == 0) {
                    return (onExtraCallback[]) onextracallbackArr.clone();
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallback(String str, int i) {
            }

            static {
                onExtraCallback[] onextracallbackArr$values = $values();
                $VALUES = onextracallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
                Companion = new C0013onWarmupCompleted(null);
                int i = IAuthTabCallback + 103;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            /* renamed from: o.FaceSDK$onWarmupCompleted$onExtraCallback$onWarmupCompleted, reason: collision with other inner class name */
            public static final class C0013onWarmupCompleted {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ C0013onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C0013onWarmupCompleted() {
                }

                public final onExtraCallback onExtraCallback(@NotNull String str) {
                    Object next;
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    Iterator it = onExtraCallback.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        int i2 = onExtraCallback + 115;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        next = it.next();
                        if (StringsKt.equals(((onExtraCallback) next).name(), str, true)) {
                            int i4 = onWarmupCompleted + 19;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            break;
                        }
                    }
                    return (onExtraCallback) next;
                }
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String onWarmupCompleted(@NotNull Resources resources, @NotNull Number number, @NotNull onExtraCallback onextracallback, @NotNull Locale locale) throws NoWhenBranchMatchedException, Resources.NotFoundException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(resources, "");
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(locale, "");
            switch (onExtraCallbackWithResult.onExtraCallback[onextracallback.ordinal()]) {
                case 1:
                    return onWarmupCompleted(resources, number, locale);
                case 2:
                case 3:
                    return onNavigationEvent(this, resources, number, 2, ',', '.', R.string.currency_aud_prefix, onWarmupCompleted(onextracallback, locale), false, 128, null);
                case 4:
                    return onExtraCallback(resources, number, 2, ',', '.', R.string.currency_cny_suffix, onWarmupCompleted(onextracallback, locale), false);
                case 5:
                    return (String) onNavigationEvent(552659220, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, resources, number, '.', Integer.valueOf(R.string.currency_vnd_prefix), Boolean.valueOf(onWarmupCompleted(onextracallback, locale))}, -552659219, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                case 6:
                    return onExtraCallback(resources, number, 2, ' ', ',', R.string.currency_rub_suffix, onWarmupCompleted(onextracallback, locale), true);
                case 7:
                    return onNavigationEvent(this, resources, number, 2, ',', '.', R.string.currency_thb_prefix, onWarmupCompleted(onextracallback, locale), false, 128, null);
                case 8:
                    String str = (String) onNavigationEvent(552659220, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, resources, number, ',', Integer.valueOf(R.string.currency_jpy_suffix), Boolean.valueOf(onWarmupCompleted(onextracallback, locale))}, -552659219, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                    int i2 = onNavigationEvent + 119;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    return str;
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                    String strOnExtraCallbackWithResult = onExtraCallbackWithResult(resources, number, locale);
                    int i4 = IAuthTabCallbackDefault + 121;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return strOnExtraCallbackWithResult;
                    }
                    throw null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public static /* synthetic */ String onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, Context context, Number number, onExtraCallback onextracallback, Locale locale, int i, Object obj) throws NoWhenBranchMatchedException, Resources.NotFoundException {
            int i2 = 2 % 2;
            if ((i & 8) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                int i3 = IAuthTabCallbackDefault + 45;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
            String strOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted(context, number, onextracallback, locale);
            int i5 = onNavigationEvent + 19;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return strOnWarmupCompleted;
        }

        public final String onWarmupCompleted(@NotNull Context context, @NotNull Number number, @NotNull onExtraCallback onextracallback, @NotNull Locale locale) throws NoWhenBranchMatchedException, Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(locale, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            String strOnWarmupCompleted = onWarmupCompleted(resources, number, onextracallback, locale);
            int i4 = onNavigationEvent + 45;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return strOnWarmupCompleted;
        }

        public static /* synthetic */ boolean onExtraCallback(onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback, Locale locale, int i, Object obj) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 27;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            boolean zOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted(onextracallback, locale);
            int i4 = IAuthTabCallbackDefault + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return zOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final boolean onWarmupCompleted(@NotNull onExtraCallback onextracallback, @NotNull Locale locale) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(onextracallback, "");
                Intrinsics.checkNotNullParameter(locale, "");
                int i3 = onExtraCallbackWithResult.onExtraCallback[onextracallback.ordinal()];
                throw null;
            }
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(locale, "");
            switch (onExtraCallbackWithResult.onExtraCallback[onextracallback.ordinal()]) {
                case 1:
                    switch (onExtraCallbackWithResult.onExtraCallbackWithResult[onExtraCallback.Companion.onExtraCallback(locale).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                            return true;
                        default:
                            return false;
                    }
                case 2:
                case 3:
                case 5:
                case 7:
                    int i4 = onNavigationEvent + 21;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                case 4:
                case 6:
                case 8:
                    return false;
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                    int i6 = onExtraCallbackWithResult.onExtraCallbackWithResult[onExtraCallback.Companion.onExtraCallback(locale).ordinal()];
                    return i6 == 1 || i6 == 5;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private final String onWarmupCompleted(Resources resources, Number number, Locale locale) throws NoWhenBranchMatchedException {
            Pair pairIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 31;
            onNavigationEvent = i2 % 128;
            boolean z = i2 % 2 == 0 ? number.doubleValue() < 0.0d : number.doubleValue() < 1.0d;
            long jAbs = Math.abs(number.longValue());
            String str = z ? "-" : "";
            switch (onExtraCallbackWithResult.onExtraCallbackWithResult[onExtraCallback.Companion.onExtraCallback(locale).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                    pairIAuthTabCallback = getWrite.IAuthTabCallback((String) onNavigationEvent(1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, Long.valueOf(jAbs), ','}, -1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()), resources.getString(R.string.currency_krw_prefix));
                    break;
                case 10:
                    pairIAuthTabCallback = getWrite.IAuthTabCallback((String) onNavigationEvent(1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, Long.valueOf(jAbs), ','}, -1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()), resources.getString(R.string.currency_krw_suffix));
                    break;
                case 11:
                    pairIAuthTabCallback = getWrite.IAuthTabCallback((String) onNavigationEvent(1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, Long.valueOf(jAbs), ','}, -1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()), resources.getString(R.string.currency_krw_chinese));
                    break;
                case LiveCheckConstants.SVC_U1 /* 12 */:
                    pairIAuthTabCallback = getWrite.IAuthTabCallback((String) onNavigationEvent(1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, Long.valueOf(jAbs), '.'}, -1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()), resources.getString(R.string.currency_krw_vietnamese));
                    break;
                case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                    pairIAuthTabCallback = getWrite.IAuthTabCallback((String) onNavigationEvent(1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, Long.valueOf(jAbs), ' '}, -1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent()), resources.getString(R.string.currency_krw_russian));
                    int i3 = onNavigationEvent + 51;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String str2 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
            Object objIAuthTabCallback = pairIAuthTabCallback.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(objIAuthTabCallback, "");
            String str3 = (String) objIAuthTabCallback;
            if (onWarmupCompleted(onExtraCallback.KRW, locale)) {
                return str + str3 + str2;
            }
            String str4 = str + str2 + str3;
            int i5 = IAuthTabCallbackDefault + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str4;
            }
            throw null;
        }

        private final String onExtraCallbackWithResult(Resources resources, Number number, Locale locale) throws NoWhenBranchMatchedException, Resources.NotFoundException {
            String str;
            int i = 2 % 2;
            onExtraCallback onExtraCallback2 = onExtraCallback.Companion.onExtraCallback(locale);
            FaceSDK faceSDK = FaceSDK.onWarmupCompleted;
            Pair pairOnExtraCallback = FaceSDK.onExtraCallback(faceSDK, onExtraCallback2);
            char cCharValue = ((Character) pairOnExtraCallback.onExtraCallbackWithResult()).charValue();
            char cCharValue2 = ((Character) pairOnExtraCallback.IAuthTabCallback()).charValue();
            boolean z = number.doubleValue() < 0.0d;
            String str2 = FaceSDK.IAuthTabCallback(faceSDK, "#,##0.##", cCharValue, cCharValue2).format(Math.abs(number.doubleValue()));
            if (z) {
                int i2 = IAuthTabCallbackDefault + 103;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                str = "-";
            } else {
                str = "";
            }
            String string = resources.getString(R.string.currency_eur);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!onWarmupCompleted(onExtraCallback.EUR, locale)) {
                return str + str2 + " " + string;
            }
            int i4 = onNavigationEvent + 83;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0 ? onExtraCallbackWithResult.onExtraCallbackWithResult[onExtraCallback2.ordinal()] != 5 : onExtraCallbackWithResult.onExtraCallbackWithResult[onExtraCallback2.ordinal()] != 3) {
                return str + string + str2;
            }
            return string + " " + str + str2;
        }

        static /* synthetic */ String onNavigationEvent(onWarmupCompleted onwarmupcompleted, Resources resources, Number number, int i, char c, char c2, int i2, boolean z, boolean z2, int i3, Object obj) throws Throwable {
            int i4 = 2 % 2;
            int i5 = IAuthTabCallbackDefault + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            String strOnExtraCallback = onwarmupcompleted.onExtraCallback(resources, number, i, c, c2, i2, z, (i3 & 128) != 0 ? true : z2);
            int i7 = IAuthTabCallbackDefault + 17;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return strOnExtraCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private final String onExtraCallback(Resources resources, Number number, int i, char c, char c2, int i2, boolean z, boolean z2) throws Throwable {
            boolean z3;
            int i3 = 2 % 2;
            if (number.doubleValue() < 0.0d) {
                int i4 = IAuthTabCallbackDefault + 49;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            double dAbs = Math.abs(number.doubleValue());
            Object[] objArr = new Object[1];
            a(new int[]{0, 1, 191, 0}, true, new byte[]{1}, objArr);
            String str = FaceSDK.IAuthTabCallback(FaceSDK.onWarmupCompleted, "#,##0." + StringsKt.repeat(((String) objArr[0]).intern(), i), c, c2).format(dAbs);
            String str2 = z3 ? "-" : "";
            String string = resources.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (z) {
                String str3 = str2 + string + str;
                int i6 = onNavigationEvent + 65;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    return str3;
                }
                throw null;
            }
            if (!z2) {
                return str2 + str + string;
            }
            return str2 + str + " " + string;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Resources.NotFoundException {
            String str;
            boolean z = false;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            Resources resources = (Resources) objArr[1];
            Number number = (Number) objArr[2];
            char cCharValue = ((Character) objArr[3]).charValue();
            int iIntValue = ((Number) objArr[4]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0 ? number.doubleValue() < 0.0d : number.doubleValue() < 1.0d) {
                z = true;
            }
            String str2 = (String) onNavigationEvent(1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onwarmupcompleted, Long.valueOf(Math.abs(number.longValue())), Character.valueOf(cCharValue)}, -1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
            if (z) {
                int i3 = IAuthTabCallbackDefault + 109;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                str = "-";
            } else {
                str = "";
            }
            String string = resources.getString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (zBooleanValue) {
                return str + string + str2;
            }
            return str + str2 + string;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            FaceSDK faceSDK;
            char c;
            long jLongValue = ((Number) objArr[1]).longValue();
            char cCharValue = ((Character) objArr[2]).charValue();
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                faceSDK = FaceSDK.onWarmupCompleted;
                c = 31;
            } else {
                faceSDK = FaceSDK.onWarmupCompleted;
                c = '.';
            }
            String str = FaceSDK.IAuthTabCallback(faceSDK, "#,###", cCharValue, c).format(jLongValue);
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }

        private final String onNavigationEvent(Resources resources, Number number, char c, int i, boolean z) {
            return (String) onNavigationEvent(552659220, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, resources, number, Character.valueOf(c), Integer.valueOf(i), Boolean.valueOf(z)}, -552659219, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
        }

        private final String onExtraCallbackWithResult(long j, char c) {
            return (String) onNavigationEvent(1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, Long.valueOf(j), Character.valueOf(c)}, -1650359824, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
        }

        static void IAuthTabCallback() {
            onExtraCallback = new char[]{27193};
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted = 1;

        public static final /* synthetic */ class onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final /* synthetic */ int[] onExtraCallbackWithResult;

            static {
                int[] iArr = new int[onExtraCallback.values().length];
                try {
                    iArr[onExtraCallback.KOREAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallback.CHINESE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onExtraCallback.CHINESE_TRADITIONAL.ordinal()] = 3;
                    int i = onExtraCallback + 69;
                    IAuthTabCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[onExtraCallback.VIETNAMESE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[onExtraCallback.RUSSIAN.ordinal()] = 5;
                    int i3 = onExtraCallback + 43;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[onExtraCallback.THAI.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[onExtraCallback.ENGLISH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[onExtraCallback.GERMAN.ordinal()] = 8;
                    int i6 = IAuthTabCallback + 33;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[onExtraCallback.DUTCH.ordinal()] = 9;
                    int i8 = 2 % 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[onExtraCallback.FRENCH.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[onExtraCallback.FINNISH.ordinal()] = 11;
                    int i9 = 2 % 2;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[onExtraCallback.SPANISH.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[onExtraCallback.ITALIAN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                onExtraCallbackWithResult = iArr;
            }
        }

        static {
            int i = onWarmupCompleted + 27;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i6;
            int i8 = i5 | i7;
            int i9 = (~(i | i6)) | i5;
            int i10 = ~i;
            int i11 = (~(i6 | i | i5)) | (~(i7 | i10)) | (~((~i5) | i10));
            int i12 = i + i5 + i3 + (1609234610 * i2) + (1307081305 * i4);
            int i13 = i12 * i12;
            int i14 = (((-490261092) * i) - 1772093440) + (1576585830 * i5) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i3) + ((-2101346304) * i2) + (23068672 * i4) + ((-2103967744) * i13);
            int i15 = (i * 273352028) + 245730370 + (i5 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i3 * 273352337) + (i2 * (-770635566)) + (i4 * (-73506199)) + (i13 * (-2011693056));
            return i14 + ((i15 * i15) * 1080557568) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }

        private IAuthTabCallback() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
            String str;
            String str2;
            String strOnExtraCallback;
            String str3;
            int i;
            String str4;
            String str5;
            str = "";
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            Number number = (Number) objArr[1];
            Resources resources = (Resources) objArr[2];
            Locale locale = (Locale) objArr[3];
            String str6 = (String) objArr[4];
            String str7 = (String) objArr[5];
            String str8 = (String) objArr[6];
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(resources, "");
            Intrinsics.checkNotNullParameter(locale, "");
            double dDoubleValue = number.doubleValue();
            double dAbs = Math.abs(dDoubleValue);
            String str9 = dDoubleValue < 0.0d ? "-" : "";
            onExtraCallback onExtraCallback2 = onExtraCallback.Companion.onExtraCallback(locale);
            int[] iArr = onNavigationEvent.onExtraCallbackWithResult;
            switch (iArr[onExtraCallback2.ordinal()]) {
                case 1:
                    str2 = str9;
                    strOnExtraCallback = iAuthTabCallback.onExtraCallback(resources, dAbs);
                    int i3 = onExtraCallbackWithResult + 93;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (str8 == null && str6 == null && str7 == null) {
                        if (iArr[onExtraCallback2.ordinal()] != 1) {
                            return str2 + strOnExtraCallback + " " + str8;
                        }
                        List listSplit$default = StringsKt.split$default(StringsKt.trim(str8).toString(), new String[]{" "}, false, 0, 6, (Object) null);
                        if (listSplit$default.size() != 2) {
                            return str2 + strOnExtraCallback + str8;
                        }
                        return listSplit$default.get(0) + " " + str2 + strOnExtraCallback + listSplit$default.get(1);
                    }
                    i = iArr[onExtraCallback2.ordinal()];
                    if (i == 1) {
                        if (str6 != null) {
                            str4 = str6 + " ";
                        } else {
                            str4 = "";
                        }
                        return str4 + str2 + strOnExtraCallback + (str7 != null ? str7 : "");
                    }
                    int i5 = IAuthTabCallback + 43;
                    int i6 = i5 % 128;
                    onExtraCallbackWithResult = i6;
                    if (i5 % 2 == 0 ? i != 2 : i != 3) {
                        if (i != 3) {
                            if (str6 != null) {
                                str5 = str6 + " ";
                            } else {
                                int i7 = i6 + 81;
                                IAuthTabCallback = i7 % 128;
                                if (i7 % 2 == 0) {
                                    int i8 = 3 % 3;
                                }
                                str5 = "";
                            }
                            if (str7 != null) {
                                str = " " + str7;
                            }
                            return str5 + str2 + strOnExtraCallback + str;
                        }
                    }
                    if (str6 == null) {
                        str6 = "";
                    }
                    return str6 + str2 + strOnExtraCallback + (str7 != null ? str7 : "");
                case 2:
                    Locale locale2 = Locale.CHINESE;
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    String string = resources.getString(R.string.unit_compact_ten_thousand_chinese);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = resources.getString(R.string.unit_compact_hundred_million_chinese);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    str3 = str9;
                    strOnExtraCallback = iAuthTabCallback.onNavigationEvent(dAbs, locale2, string, string2);
                    str2 = str3;
                    if (str8 == null) {
                    }
                    i = iArr[onExtraCallback2.ordinal()];
                    if (i == 1) {
                    }
                    break;
                case 3:
                    Locale locale3 = Locale.TAIWAN;
                    Intrinsics.checkNotNullExpressionValue(locale3, "");
                    String string3 = resources.getString(R.string.unit_compact_ten_thousand_chinese_traditional);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String string4 = resources.getString(R.string.unit_compact_hundred_million_chinese_traditional);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    str3 = str9;
                    strOnExtraCallback = iAuthTabCallback.onNavigationEvent(dAbs, locale3, string3, string4);
                    str2 = str3;
                    if (str8 == null) {
                    }
                    i = iArr[onExtraCallback2.ordinal()];
                    if (i == 1) {
                    }
                    break;
                case 4:
                    strOnExtraCallback = iAuthTabCallback.IAuthTabCallback(resources, dAbs);
                    str2 = str9;
                    if (str8 == null) {
                    }
                    i = iArr[onExtraCallback2.ordinal()];
                    if (i == 1) {
                    }
                    break;
                case 5:
                    strOnExtraCallback = iAuthTabCallback.onWarmupCompleted(resources, dAbs);
                    str2 = str9;
                    if (str8 == null) {
                    }
                    i = iArr[onExtraCallback2.ordinal()];
                    if (i == 1) {
                    }
                    break;
                case 6:
                    strOnExtraCallback = iAuthTabCallback.onNavigationEvent(resources, dAbs);
                    str2 = str9;
                    if (str8 == null) {
                    }
                    i = iArr[onExtraCallback2.ordinal()];
                    if (i == 1) {
                    }
                    break;
                case 7:
                case 8:
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                case 10:
                case 11:
                case LiveCheckConstants.SVC_U1 /* 12 */:
                case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                    strOnExtraCallback = iAuthTabCallback.onExtraCallbackWithResult(resources, dAbs);
                    str2 = str9;
                    if (str8 == null) {
                    }
                    i = iArr[onExtraCallback2.ordinal()];
                    if (i == 1) {
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public static /* synthetic */ String onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, Number number, Context context, Locale locale, String str, String str2, String str3, int i, Object obj) {
            Locale locale2;
            String str4;
            String str5;
            int i2 = 2 % 2;
            if ((i & 4) != 0) {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                locale2 = locale3;
            } else {
                locale2 = locale;
            }
            Object obj2 = null;
            if ((i & 8) != 0) {
                int i3 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                str4 = null;
            } else {
                str4 = str;
            }
            String str6 = (i & 16) != 0 ? null : str2;
            if ((i & 32) != 0) {
                int i4 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                str5 = null;
            } else {
                str5 = str3;
            }
            return (String) onWarmupCompleted(-1776901280, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1776901281, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{iAuthTabCallback, number, context, locale2, str4, str6, str5});
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            Number number = (Number) objArr[1];
            Context context = (Context) objArr[2];
            Locale locale = (Locale) objArr[3];
            String str = (String) objArr[4];
            String str2 = (String) objArr[5];
            String str3 = (String) objArr[6];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(locale, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            String str4 = (String) onWarmupCompleted(1946363267, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1946363267, iIAuthTabCallback, new Object[]{iAuthTabCallback, number, resources, locale, str, str2, str3});
            int i4 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return str4;
            }
            throw null;
        }

        private final String onExtraCallback(Resources resources, double d) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(resources.getString(R.string.unit_compact_ten_thousand), "");
                Intrinsics.checkNotNullExpressionValue(resources.getString(R.string.unit_compact_hundred_million), "");
                throw null;
            }
            String string = resources.getString(R.string.unit_compact_ten_thousand);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = resources.getString(R.string.unit_compact_hundred_million);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (d < 1230.0d) {
                onNavigationEvent onnavigationevent = onNavigationEvent.onNavigationEvent;
                Locale locale = Locale.KOREAN;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                return onNavigationEvent.IAuthTabCallback(onnavigationevent, Long.valueOf((long) d), locale, null, 4, null);
            }
            if (d < 10000.0d) {
                int i3 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onNavigationEvent onnavigationevent2 = onNavigationEvent.onNavigationEvent;
                Locale locale2 = Locale.KOREAN;
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                return onNavigationEvent.IAuthTabCallback(onnavigationevent2, Long.valueOf((long) d), locale2, null, 4, null);
            }
            if (d < 100000.0d) {
                Locale locale3 = Locale.KOREAN;
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                return IAuthTabCallback(d / 10000.0d, 2, locale3) + string;
            }
            if (d < 1000000.0d) {
                Locale locale4 = Locale.KOREAN;
                Intrinsics.checkNotNullExpressionValue(locale4, "");
                String str = IAuthTabCallback(d / 10000.0d, 1, locale4) + string;
                int i5 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 18 / 0;
                }
                return str;
            }
            if (d < 1.0E7d) {
                onNavigationEvent onnavigationevent3 = onNavigationEvent.onNavigationEvent;
                Locale locale5 = Locale.KOREAN;
                Intrinsics.checkNotNullExpressionValue(locale5, "");
                return onNavigationEvent.IAuthTabCallback(onnavigationevent3, Long.valueOf((long) (d / 10000.0d)), locale5, null, 4, null) + string;
            }
            if (d >= 1.0E8d) {
                Locale locale6 = Locale.KOREAN;
                Intrinsics.checkNotNullExpressionValue(locale6, "");
                return IAuthTabCallback(d / 1.0E8d, 2, locale6) + string2;
            }
            onNavigationEvent onnavigationevent4 = onNavigationEvent.onNavigationEvent;
            Locale locale7 = Locale.KOREAN;
            Intrinsics.checkNotNullExpressionValue(locale7, "");
            return onNavigationEvent.IAuthTabCallback(onnavigationevent4, Long.valueOf((long) (d / 10000.0d)), locale7, null, 4, null) + string;
        }

        private final String onNavigationEvent(double d, Locale locale, String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 59;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if (d < 1230.0d) {
                int i6 = i4 + 5;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) d), locale, null, 4, null);
            }
            if (d < 10000.0d) {
                int i8 = i2 + 19;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                String strIAuthTabCallback = onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) d), locale, null, 4, null);
                int i10 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    return strIAuthTabCallback;
                }
                throw null;
            }
            if (d < 100000.0d) {
                return IAuthTabCallback(d / 10000.0d, 2, locale) + str;
            }
            if (d < 1000000.0d) {
                return IAuthTabCallback(d / 10000.0d, 1, locale) + str;
            }
            if (d < 1.0E7d) {
                return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) (d / 10000.0d)), locale, null, 4, null) + str;
            }
            if (d < 1.0E8d) {
                return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) (d / 10000.0d)), locale, null, 4, null) + str;
            }
            return IAuthTabCallback(d / 1.0E8d, 2, locale) + str2;
        }

        private final String IAuthTabCallback(Resources resources, double d) throws Throwable {
            int i = 2 % 2;
            String string = resources.getString(R.string.unit_compact_thousand_vietnamese);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = resources.getString(R.string.unit_compact_million_vietnamese);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (d < 100000.0d) {
                return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) d), new Locale("vi"), null, 4, null);
            }
            if (d < 1000000.0d) {
                String str = onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) (d / 1000.0d)), new Locale("vi"), null, 4, null) + string;
                int i2 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
            String str2 = StringsKt.replace$default(IAuthTabCallback(d / 1000000.0d, 2, new Locale("vi")), '.', ',', false, 4, (Object) null) + string2;
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }

        private final String onWarmupCompleted(Resources resources, double d) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String string = resources.getString(R.string.unit_compact_thousand);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = resources.getString(R.string.unit_compact_million);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (d < 100000.0d) {
                String strIAuthTabCallback = onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) d), new Locale("ru"), null, 4, null);
                int i4 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 22 / 0;
                }
                return strIAuthTabCallback;
            }
            if (d < 1000000.0d) {
                return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) (d / 1000.0d)), new Locale("ru"), null, 4, null) + string;
            }
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            return IAuthTabCallback(d / 1000000.0d, 2, locale) + string2;
        }

        private final String onExtraCallbackWithResult(Resources resources, double d) throws Throwable {
            int i = 2 % 2;
            String string = resources.getString(R.string.unit_compact_thousand);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = resources.getString(R.string.unit_compact_million);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (d < 1000.0d) {
                int i2 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    onNavigationEvent onnavigationevent = onNavigationEvent.onNavigationEvent;
                    Locale locale = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    return onNavigationEvent.IAuthTabCallback(onnavigationevent, Long.valueOf((long) d), locale, null, 4, null);
                }
                onNavigationEvent onnavigationevent2 = onNavigationEvent.onNavigationEvent;
                Locale locale2 = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                return onNavigationEvent.IAuthTabCallback(onnavigationevent2, Long.valueOf((long) d), locale2, null, 4, null);
            }
            if (d < 100000.0d) {
                Locale locale3 = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                String str = IAuthTabCallback(d / 1000.0d, 2, locale3) + string;
                int i3 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return str;
            }
            if (d >= 1000000.0d) {
                Locale locale4 = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(locale4, "");
                return IAuthTabCallback(d / 1000000.0d, 2, locale4) + string2;
            }
            onNavigationEvent onnavigationevent3 = onNavigationEvent.onNavigationEvent;
            Locale locale5 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale5, "");
            return onNavigationEvent.IAuthTabCallback(onnavigationevent3, Long.valueOf((long) (d / 1000.0d)), locale5, null, 4, null) + string;
        }

        private final String onNavigationEvent(Resources resources, double d) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                String string = resources.getString(R.string.unit_compact_thousand);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = resources.getString(R.string.unit_compact_million);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (d < 1000.0d) {
                    return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) d), new Locale("th"), null, 4, null);
                }
                if (d < 100000.0d) {
                    return IAuthTabCallback(d / 1000.0d, 2, new Locale("th")) + string;
                }
                if (d < 1000000.0d) {
                    return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf((long) (d / 1000.0d)), new Locale("th"), null, 4, null) + string;
                }
                String str = IAuthTabCallback(d / 1000000.0d, 2, new Locale("th")) + string2;
                int i3 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return str;
            }
            Intrinsics.checkNotNullExpressionValue(resources.getString(R.string.unit_compact_thousand), "");
            Intrinsics.checkNotNullExpressionValue(resources.getString(R.string.unit_compact_million), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final String IAuthTabCallback(double d, int i, Locale locale) throws NumberFormatException {
            int i2 = i;
            int i3 = 2 % 2;
            Locale locale2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            double d2 = Double.parseDouble(WorkForegroundRunnableExternalSyntheticLambda0.onWarmupCompleted("%." + i2 + "f", locale2, Double.valueOf(d)));
            long j = (long) d2;
            if (d2 == j) {
                return onNavigationEvent.IAuthTabCallback(onNavigationEvent.onNavigationEvent, Long.valueOf(j), locale, null, 4, null);
            }
            if (i2 > 0) {
                int i4 = 1;
                while (true) {
                    String str = "%." + i4 + "f";
                    Locale locale3 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale3, "");
                    if (Double.parseDouble(WorkForegroundRunnableExternalSyntheticLambda0.onWarmupCompleted(str, locale3, Double.valueOf(d2))) != d2) {
                        if (i4 == i2) {
                            break;
                        }
                        int i5 = onExtraCallbackWithResult + 19;
                        int i6 = i5 % 128;
                        IAuthTabCallback = i6;
                        i4 = i5 % 2 == 0 ? i4 + 13 : i4 + 1;
                        int i7 = i6 + 27;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        int i9 = onExtraCallbackWithResult + 107;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 73 / 0;
                        }
                        i2 = i4;
                    }
                }
            }
            return onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(Double.valueOf(d2), locale, Integer.valueOf(i2));
        }

        public final String onWarmupCompleted(@NotNull Number number, @NotNull Context context, @NotNull Locale locale, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            return (String) onWarmupCompleted(-1776901280, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1776901281, iIAuthTabCallback, new Object[]{this, number, context, locale, str, str2, str3});
        }

        public final String onExtraCallbackWithResult(@NotNull Number number, @NotNull Resources resources, @NotNull Locale locale, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            return (String) onWarmupCompleted(1946363267, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1946363267, iIAuthTabCallback, new Object[]{this, number, resources, locale, str, str2, str3});
        }
    }
}
