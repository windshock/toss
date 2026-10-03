package o;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CERT_GetAuthorityKeyIdentifierInfo;
import o.SetDetectableSize;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetAuthorityKeyIdentifierInfo extends toRealPath {
    private static final byte[] $$a = {84, 79, 22, 41};
    private static final int $$b = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onWarmupCompleted = 478309042;
    private final onExtraCallbackWithResult IAuthTabCallback;
    private final onExtraCallback onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Context onNavigationEvent;

    public interface onExtraCallbackWithResult {
        void writeTypedList();
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.REACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 105
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = o.CERT_GetAuthorityKeyIdentifierInfo.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r5 = r2
            r8 = r7
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
        L27:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CERT_GetAuthorityKeyIdentifierInfo.$$c(short, short, byte):java.lang.String");
    }

    public static /* synthetic */ Unit onExtraCallback(CERT_GetAuthorityKeyIdentifierInfo cERT_GetAuthorityKeyIdentifierInfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(cERT_GetAuthorityKeyIdentifierInfo, setDetectableSize);
        }
        onNavigationEvent(cERT_GetAuthorityKeyIdentifierInfo, setDetectableSize);
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CERT_GetAuthorityKeyIdentifierInfo)) {
            return false;
        }
        CERT_GetAuthorityKeyIdentifierInfo cERT_GetAuthorityKeyIdentifierInfo = (CERT_GetAuthorityKeyIdentifierInfo) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, cERT_GetAuthorityKeyIdentifierInfo.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, cERT_GetAuthorityKeyIdentifierInfo.IAuthTabCallback)) {
            return this.onExtraCallback == cERT_GetAuthorityKeyIdentifierInfo.onExtraCallback;
        }
        int i4 = asBinder + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode();
        int i4 = asBinder + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossMoneyLimitWarningBannerViewModel(context=" + this.onNavigationEvent + ", navigator=" + this.IAuthTabCallback + ", bannerType=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CERT_GetAuthorityKeyIdentifierInfo(@NotNull Context context, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        String string;
        super(toRealPath.onNavigationEvent.TOSS_MONEY_LIMIT_WARNING_BANNER);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onNavigationEvent = context;
        this.IAuthTabCallback = onextracallbackwithresult;
        this.onExtraCallback = onextracallback;
        int i = onNavigationEvent.onExtraCallback[onextracallback.ordinal()];
        if (i == 1) {
            string = context.getString(R.string.app_view_account_history_tossmoney_limit_warning_banner___c2ec477fff);
            int i2 = asBinder + 109;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
            }
            Intrinsics.checkNotNull(string);
            this.onExtraCallbackWithResult = string;
            int i3 = asBinder + 19;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = IAuthTabCallbackDefault + 103;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = R.string.app_view_account_history_tossmoney_limit_warning_banner_reached;
            Object[] objArr = new Object[0];
            objArr[0] = PlayerErrorCode.onPostMessage();
            string = context.getString(i6, objArr);
        } else {
            string = context.getString(R.string.app_view_account_history_tossmoney_limit_warning_banner_reached, PlayerErrorCode.onPostMessage());
        }
        int i7 = 2 % 2;
        Intrinsics.checkNotNull(string);
        this.onExtraCallbackWithResult = string;
        int i32 = asBinder + 19;
        IAuthTabCallbackDefault = i32 % 128;
        int i42 = i32 % 2;
    }

    public long onWarmupCompleted() {
        int i = 2 % 2;
        long jHashCode = ("toss-money-limit-warning-banner-" + this.IAuthTabCallback).hashCode();
        int i2 = IAuthTabCallbackDefault + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return jHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 55;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onExtraCallbackWithResult;
            int i4 = 27 / 0;
        } else {
            str = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 27;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        this.IAuthTabCallback.writeTypedList();
        ConvertByteArrayToFloatArray.onExtraCallback(1246679L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.viewmodel.header.TossMoneyLimitWarningBannerViewModel$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(CERT_GetAuthorityKeyIdentifierInfo cERT_GetAuthorityKeyIdentifierInfo, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        String lowerCase = cERT_GetAuthorityKeyIdentifierInfo.onExtraCallback.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        Object[] objArr = new Object[1];
        a(4 - Color.alpha(0), -MotionEvent.axisFromString(""), new char[]{4, 65525, 0, '\t'}, true, View.resolveSize(0, 0) + 267, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), lowerCase);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 105;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback WARNING = new onExtraCallback("WARNING", 0);
        public static final onExtraCallback REACHED = new onExtraCallback("REACHED", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            return new onExtraCallback[]{WARNING, REACHED};
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallback valueOf(String str) {
            return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
        }

        public static onExtraCallback[] values() {
            return (onExtraCallback[]) $VALUES.clone();
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CERT_GetAuthorityKeyIdentifierInfo.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }
}
