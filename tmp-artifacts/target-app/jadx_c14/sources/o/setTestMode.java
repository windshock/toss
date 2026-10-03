package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.setTestMode;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.init.v2.CheckoutResult;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setTestMode {
    public static final int IAuthTabCallback;
    private static int asBinder;
    private static int asInterface;
    public static final setTestMode onExtraCallback;
    private static final List<String> onExtraCallbackWithResult;
    private static final Lazy onNavigationEvent;
    private static final Lazy onWarmupCompleted;
    private static final byte[] $$a = {113, 66, 51, 67};
    private static final int $$b = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r5 = 4 - r5
            int r6 = r6 * 2
            int r6 = r6 + 105
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = o.setTestMode.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTestMode.$$c(int, short, byte):java.lang.String");
    }

    public static /* synthetic */ ResourceUriFetcherFactory IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onPostMessage();
        }
        onPostMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i | i4)) | i2;
        int i8 = i4 | i | i2;
        int i9 = ~i;
        int i10 = i + i2 + i5 + ((-421447895) * i3) + ((-859425246) * i6);
        int i11 = i10 * i10;
        int i12 = (i * (-629045104)) + 1817116672 + ((-629045104) * i2) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i5) + ((-2125594624) * i3) + (888930304 * i6) + (441384960 * i11);
        int i13 = (i * 1303038832) + 2077918271 + (i2 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i5 * 1303038783) + (i3 * 1583617559) + (i6 * (-1102559138)) + (i11 * 510722048);
        switch (i12 + (i13 * i13 * 607191040)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onRelationshipValidationResult();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnRelationshipValidationResult = onRelationshipValidationResult();
        int i3 = onTransact + 7;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnRelationshipValidationResult;
    }

    private setTestMode() {
    }

    static {
        asInterface = 0;
        onActivityLayout();
        onExtraCallback = new setTestMode();
        onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.model.InitData$$ExternalSyntheticLambda0
            public final Object invoke() {
                return setTestMode.IAuthTabCallback();
            }
        });
        onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.model.InitData$$ExternalSyntheticLambda1
            public final Object invoke() {
                return setTestMode.onNavigationEvent();
            }
        });
        onExtraCallbackWithResult = CollectionsKt.listOf(new String[]{"남궁", "황보", "제갈", "사공", "선우", "서문", "독고", "동방", "어금", "망절", "무본", "황목", "등정", "장곡", "강전"});
        IAuthTabCallback = 8;
        int i = IAuthTabCallbackStub + 107;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ResourceUriFetcherFactory onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackDefault + 123;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return resourceUriFetcherFactory;
        }
        throw null;
    }

    private static final ResourceUriFetcherFactory onPostMessage() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            ResourceUriFetcherFactory resourceUriFetcherFactoryExtraCallback = ((RealInterceptorChain) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RealInterceptorChain.class)).extraCallback();
            int i3 = IAuthTabCallbackDefault + 117;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return resourceUriFetcherFactoryExtraCallback;
        }
        Response response2 = Response.onNavigationEvent;
        ((RealInterceptorChain) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RealInterceptorChain.class)).extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 onRelationshipValidationResult() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnActivityResized;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1OnActivityResized = onExtraCallback.onMessageChannelReady().onActivityResized();
            int i3 = 45 / 0;
        } else {
            textRoundCornerProgressBarSavedState1OnActivityResized = onExtraCallback.onMessageChannelReady().onActivityResized();
        }
        int i4 = onTransact + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnActivityResized;
    }

    public final TextRoundCornerProgressBarSavedState1 access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onWarmupCompleted.getValue();
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    @JvmStatic
    public static final long onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100 = onExtraCallback.access100();
        Object[] objArr = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 1, (ViewConfiguration.getTouchSlop() >> 8) + 1, new char[]{0}, true, (-16776996) - Color.rgb(0, 0, 0), objArr);
        Long longOrNull = StringsKt.toLongOrNull(textRoundCornerProgressBarSavedState1Access100.onExtraCallbackWithResult("checkout_timestamp", ((String) objArr[0]).intern()));
        if (longOrNull == null) {
            return 0L;
        }
        int i4 = onTransact + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        long jLongValue = longOrNull.longValue();
        if (i5 == 0) {
            int i6 = 85 / 0;
        }
        return jLongValue;
    }

    @JvmStatic
    public static final void IAuthTabCallback(long j, long j2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long j3 = (j2 / 2) + j;
        long jOnExtraCallback = zzaj.onWarmupCompleted().onExtraCallback();
        zzag.onExtraCallbackWithResult(zzaj.onWarmupCompleted(), j3, false, 2, (Object) null);
        setTestMode settestmode = onExtraCallback;
        settestmode.access100().onNavigationEvent("checkout_timestamp", String.valueOf(j));
        settestmode.access100().onNavigationEvent("checkout_timestamp_diff", String.valueOf(jOnExtraCallback - j3));
        int i4 = onTransact + 99;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final long onExtraCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100 = onExtraCallback.access100();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{0}, true, 219 - TextUtils.lastIndexOf("", '0'), objArr);
        Long longOrNull = StringsKt.toLongOrNull(textRoundCornerProgressBarSavedState1Access100.onExtraCallbackWithResult("checkout_timestamp_diff", ((String) objArr[0]).intern()));
        if (longOrNull == null) {
            return 0L;
        }
        int i4 = onTransact + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        long jLongValue = longOrNull.longValue();
        int i6 = onTransact + 79;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return jLongValue;
    }

    public static final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback.access100().onNavigationEvent("UserInfo__minor", z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallback.access100().onNavigationEvent("UserInfo__minor", z);
        int i3 = onTransact + 7;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        String[] strArrSplit = TextUtils.split(onExtraCallback.access100().onExtraCallbackWithResult("UserInfo__userGroup", ""), ",");
        HashSet hashSet = new HashSet(Arrays.asList(Arrays.copyOf(strArrSplit, strArrSplit.length)));
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return hashSet;
    }

    public static final void IAuthTabCallback(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(set, "");
        String strJoin = TextUtils.join(",", set);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100 = onExtraCallback.access100();
        Intrinsics.checkNotNull(strJoin);
        textRoundCornerProgressBarSavedState1Access100.onNavigationEvent("UserInfo__userGroup", strJoin);
        int i4 = IAuthTabCallbackDefault + 95;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTestMode.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1Access100 = onExtraCallback.access100();
            z = true;
        } else {
            textRoundCornerProgressBarSavedState1Access100 = onExtraCallback.access100();
            z = false;
        }
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1Access100.onExtraCallback("UserInfo__accountVerified", z);
        int i3 = IAuthTabCallbackDefault + 107;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zOnExtraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback.access100().onNavigationEvent("UserInfo__accountVerified", zBooleanValue);
        int i4 = IAuthTabCallbackDefault + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final asArray onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        asArray asarray = (asArray) access100().onExtraCallback("UserInfo__current_password_format", asArray.PW_4_DIGIT_1_ALPHA);
        int i4 = IAuthTabCallbackDefault + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return asarray;
    }

    public final void onNavigationEvent(@NotNull asArray asarray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(asarray, "");
        } else {
            Intrinsics.checkNotNullParameter(asarray, "");
        }
        access100().onWarmupCompleted("UserInfo__current_password_format", asarray, true);
    }

    public final asArray getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        asArray asarray = (asArray) access100().onExtraCallback("UserInfo__new_password_format", asArray.PW_4_DIGIT_1_ALPHA);
        int i4 = onTransact + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return asarray;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull asArray asarray) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100;
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(asarray, "");
            textRoundCornerProgressBarSavedState1Access100 = access100();
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(asarray, "");
            textRoundCornerProgressBarSavedState1Access100 = access100();
            z = true;
        }
        textRoundCornerProgressBarSavedState1Access100.onWarmupCompleted("UserInfo__new_password_format", asarray, z);
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = access100().onExtraCallbackWithResult("UserInfo__salt", "");
        int i4 = onTransact + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        access100().onNavigationEvent("UserInfo__salt", str);
        int i4 = onTransact + 13;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object obj;
        setTestMode settestmode = (setTestMode) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = settestmode.access100().onExtraCallbackWithResult("UserInfo__crossRegionSalts", "");
        if (strOnExtraCallbackWithResult.length() == 0) {
            int i4 = IAuthTabCallbackDefault + 89;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return access8100.onNavigationEvent();
            }
            access8100.onNavigationEvent();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        try {
            Result.Companion companion = Result.Companion;
            wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
            iAuthTabCallback.onExtraCallback();
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            obj = Result.constructor-impl((Map) iAuthTabCallback.onExtraCallback(new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout), strOnExtraCallbackWithResult));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Map mapOnNavigationEvent = access8100.onNavigationEvent();
        if (Result.onExtraCallback(obj)) {
            obj = mapOnNavigationEvent;
        }
        return (Map) obj;
    }

    public final void onExtraCallback(@NotNull Map<String, String> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100 = access100();
        wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
        iAuthTabCallback.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        textRoundCornerProgressBarSavedState1Access100.onNavigationEvent("UserInfo__crossRegionSalts", iAuthTabCallback.onWarmupCompleted(new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout), map));
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return access100().onExtraCallbackWithResult("UserInfo__passwordVerifierRegion", "");
        }
        access100().onExtraCallbackWithResult("UserInfo__passwordVerifierRegion", "");
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        access100().onNavigationEvent("UserInfo__passwordVerifierRegion", str);
        int i4 = IAuthTabCallbackDefault + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return access100().onWarmupCompleted("UserInfo__passwordFailCountLimit", 0);
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        access100().onExtraCallbackWithResult("UserInfo__passwordFailCountLimit", i);
        int i5 = onTransact + 85;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback.access100().onExtraCallbackWithResult("LimitsInfo__Withdraw__leftMonthlyAmount", iIntValue);
            throw null;
        }
        onExtraCallback.access100().onExtraCallbackWithResult("LimitsInfo__Withdraw__leftMonthlyAmount", iIntValue);
        int i3 = onTransact + 119;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final int extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onWarmupCompleted();
        return access100().onWarmupCompleted("LimitsInfo__Transfer__maxInputAmount", 0);
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 3;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            access100().onExtraCallbackWithResult("LimitsInfo__Transfer__maxInputAmount", i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        access100().onExtraCallbackWithResult("LimitsInfo__Transfer__maxInputAmount", i);
        int i4 = onTransact + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onWarmupCompleted();
        long jOnExtraCallback = access100().onExtraCallback("LimitsInfo__Summary__waitingTransferAmount", 0L);
        int i4 = onTransact + 91;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallback;
    }

    public final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        access100().onNavigationEvent("LimitsInfo__Summary__waitingTransferAmount", j);
        int i4 = onTransact + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setTestMode settestmode = (setTestMode) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onWarmupCompleted();
        int iOnWarmupCompleted = settestmode.access100().onWarmupCompleted("LimitsInfo__UnifiedTransaction__currentTotalBalanceAmount", 0);
        int i4 = onTransact + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iOnWarmupCompleted);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setTestMode settestmode = (setTestMode) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            settestmode.access100().onExtraCallbackWithResult("LimitsInfo__UnifiedTransaction__currentTotalBalanceAmount", iIntValue);
            throw null;
        }
        settestmode.access100().onExtraCallbackWithResult("LimitsInfo__UnifiedTransaction__currentTotalBalanceAmount", iIntValue);
        int i3 = IAuthTabCallbackDefault + 93;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
        return null;
    }

    public final int onMinimized() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onWarmupCompleted();
        int iOnWarmupCompleted = access100().onWarmupCompleted("LimitsInfo__UnifiedTransaction__policyPossessionAmount", 0);
        int i4 = onTransact + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    public final void asInterface(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 113;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            access100().onExtraCallbackWithResult("LimitsInfo__UnifiedTransaction__policyPossessionAmount", i);
            return;
        }
        access100().onExtraCallbackWithResult("LimitsInfo__UnifiedTransaction__policyPossessionAmount", i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 73;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            access100().onExtraCallbackWithResult("LimitsInfo__UnifiedTransaction__maxBalancePossessionAmount", i);
        } else {
            access100().onExtraCallbackWithResult("LimitsInfo__UnifiedTransaction__maxBalancePossessionAmount", i);
            throw null;
        }
    }

    public final Boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return access100().onExtraCallback("OPEN_BANKING_NEED_TRANSITION_AGREEMENT");
        }
        access100().onExtraCallback("OPEN_BANKING_NEED_TRANSITION_AGREEMENT");
        throw null;
    }

    public final void onNavigationEvent(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bool != null) {
            onExtraCallback.access100().onNavigationEvent("OPEN_BANKING_NEED_TRANSITION_AGREEMENT", bool.booleanValue());
            int i3 = onTransact + 29;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final Boolean IAuthTabCallback_Parcel() {
        Boolean boolOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            boolOnExtraCallback = access100().onExtraCallback("OPEN_BANKING_AGREEMENT_REQUIRED");
            int i3 = 92 / 0;
        } else {
            boolOnExtraCallback = access100().onExtraCallback("OPEN_BANKING_AGREEMENT_REQUIRED");
        }
        int i4 = IAuthTabCallbackDefault + 87;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return boolOnExtraCallback;
        }
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (bool != null) {
            int i5 = i2 + 15;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            onExtraCallback.access100().onNavigationEvent("OPEN_BANKING_AGREEMENT_REQUIRED", bool.booleanValue());
        }
    }

    public static final List<onDisclaimerClick> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            PageShowPoint.Companion.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<onDisclaimerClick> listAsInterface = PageShowPoint.Companion.asInterface();
        int i3 = onTransact + 33;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return listAsInterface;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CheckoutResult checkoutResult = (CheckoutResult) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onTransact + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (checkoutResult != null) {
            int i4 = i3 + 81;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                ((Boolean) CheckoutResult.onNavigationEvent(-1946883688, 1946883689, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent3)).booleanValue();
                obj.hashCode();
                throw null;
            }
            int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            if (((Boolean) CheckoutResult.onNavigationEvent(-1946883688, 1946883689, iOnNavigationEvent5, iOnNavigationEvent4, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent6)).booleanValue()) {
                IAuthTabCallback(checkoutResult.ICustomTabsCallback(), jLongValue);
                onExtraCallback.onExtraCallback(checkoutResult);
                return null;
            }
        }
        auth.onExtraCallback(auth.onNavigationEvent, "InitData", "setInitCheckoutData invalid", (Map) null, 4, (Object) null);
        return null;
    }

    public final void onExtraCallback(@NotNull CheckoutResult checkoutResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(checkoutResult, "");
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        String strAccess100 = checkoutResult.access100();
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        String str = (String) CheckoutResult.onNavigationEvent(651634805, -651634803, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent3);
        String strOnActivityResized = checkoutResult.onActivityResized();
        String strAsInterface = checkoutResult.asInterface();
        int iExtraCallback = checkoutResult.extraCallback();
        String strWriteTypedObject = checkoutResult.writeTypedObject();
        String interfaceDescriptor = checkoutResult.getInterfaceDescriptor();
        String strAsBinder = checkoutResult.asBinder();
        String strExtraCallbackWithResult = checkoutResult.extraCallbackWithResult();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        playerErrorCode.onNavigationEvent(strAccess100, str, strOnActivityResized, strAsInterface, iExtraCallback, strWriteTypedObject, interfaceDescriptor, strAsBinder, strExtraCallbackWithResult, (String) CheckoutResult.onNavigationEvent(824555286, -824555286, iOnNavigationEvent5, iOnNavigationEvent4, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent6), checkoutResult.onMessageChannelReady(), checkoutResult.IAuthTabCallbackStubProxy(), checkoutResult.access000());
        onExtraCallbackWithResult(checkoutResult.IAuthTabCallback_Parcel());
        IAuthTabCallback(checkoutResult.onActivityLayout());
        auth authVar = auth.onNavigationEvent;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        authVar.onWarmupCompleted("USER", "userGroups", (Set) onExtraCallback(608167343, -608167335, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0], iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult()));
        int iOnNavigationEvent7 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent8 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent9 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Object[] objArr = {Boolean.valueOf(((Boolean) CheckoutResult.onNavigationEvent(1738607546, -1738607543, iOnNavigationEvent8, iOnNavigationEvent7, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent9)).booleanValue())};
        onExtraCallback(-1688500272, 1688500278, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        onNavigationEvent(accesssetIndexp.IAuthTabCallback(checkoutResult.onTransact()));
        onExtraCallback(checkoutResult.readTypedObject());
        int i4 = onTransact + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void onExtraCallback(@NotNull ImageFormatCheckerExternalSyntheticLambda0 imageFormatCheckerExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(imageFormatCheckerExternalSyntheticLambda0, "");
            addPolicy.ITrustedWebActivityServiceStub().onNavigationEvent("withdrawLimitInfo_lastSuccessTimestamp", String.valueOf(onWarmupCompleted()));
            imageFormatCheckerExternalSyntheticLambda0.onWarmupCompleted();
            throw null;
        }
        Intrinsics.checkNotNullParameter(imageFormatCheckerExternalSyntheticLambda0, "");
        addPolicy.ITrustedWebActivityServiceStub().onNavigationEvent("withdrawLimitInfo_lastSuccessTimestamp", String.valueOf(onWarmupCompleted()));
        setAccessibilityContentSizeMultipliers setaccessibilitycontentsizemultipliersOnWarmupCompleted = imageFormatCheckerExternalSyntheticLambda0.onWarmupCompleted();
        if (setaccessibilitycontentsizemultipliersOnWarmupCompleted != null) {
            onExtraCallback(565009207, -565009204, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{Integer.valueOf(setaccessibilitycontentsizemultipliersOnWarmupCompleted.IAuthTabCallback())}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        dismissActionSheet dismissactionsheetOnNavigationEvent = imageFormatCheckerExternalSyntheticLambda0.onNavigationEvent();
        if (dismissactionsheetOnNavigationEvent != null) {
            onExtraCallback.IAuthTabCallback(dismissactionsheetOnNavigationEvent.IAuthTabCallback());
            onExtraCallback(dismissactionsheetOnNavigationEvent.onWarmupCompleted());
        }
        initHybrid inithybridIAuthTabCallback = imageFormatCheckerExternalSyntheticLambda0.IAuthTabCallback();
        if (inithybridIAuthTabCallback != null) {
            int i3 = IAuthTabCallbackDefault + 69;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback.IAuthTabCallback(inithybridIAuthTabCallback.onWarmupCompleted());
                throw null;
            }
            onExtraCallback.IAuthTabCallback(inithybridIAuthTabCallback.onWarmupCompleted());
        }
        showShareActionSheetWithOptions showshareactionsheetwithoptionsOnExtraCallback = imageFormatCheckerExternalSyntheticLambda0.onExtraCallback();
        if (showshareactionsheetwithoptionsOnExtraCallback != null) {
            setTestMode settestmode = onExtraCallback;
            onExtraCallback(1658722759, -1658722757, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{settestmode, Integer.valueOf(showshareactionsheetwithoptionsOnExtraCallback.IAuthTabCallback())}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            settestmode.asInterface(showshareactionsheetwithoptionsOnExtraCallback.onWarmupCompleted());
            settestmode.onNavigationEvent(showshareactionsheetwithoptionsOnExtraCallback.onNavigationEvent());
        }
        convertToCase converttocaseOnExtraCallbackWithResult = imageFormatCheckerExternalSyntheticLambda0.onExtraCallbackWithResult();
        if (converttocaseOnExtraCallbackWithResult != null) {
            setTestMode settestmode2 = onExtraCallback;
            settestmode2.onNavigationEvent(Boolean.valueOf(converttocaseOnExtraCallbackWithResult.onExtraCallbackWithResult()));
            settestmode2.IAuthTabCallback(Boolean.valueOf(converttocaseOnExtraCallbackWithResult.onWarmupCompleted()));
        }
    }

    @JvmStatic
    public static final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 81;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback.access100().onExtraCallbackWithResult("LimitsInfo__Transfer__nextFee", i);
        int i5 = onTransact + 101;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void onNavigationEvent(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        DERConstructedSet.onNavigationEvent(!z);
    }

    public final void onNavigationEvent(@Nullable onOptionClick onoptionclick) {
        String strOnWarmupCompleted;
        long jOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100 = access100();
        if (onoptionclick == null || (strOnWarmupCompleted = onoptionclick.onWarmupCompleted()) == null) {
            strOnWarmupCompleted = "";
        }
        textRoundCornerProgressBarSavedState1Access100.onNavigationEvent("PRIMARY_ACCOUNT_TYPE", strOnWarmupCompleted);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access1002 = access100();
        if (onoptionclick != null) {
            jOnNavigationEvent = onoptionclick.onNavigationEvent();
        } else {
            int i4 = IAuthTabCallbackDefault + 111;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            jOnNavigationEvent = 0;
        }
        textRoundCornerProgressBarSavedState1Access1002.onNavigationEvent("PRIMARY_ACCOUNT_ID", jOnNavigationEvent);
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        setTestMode settestmode = (setTestMode) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if ((!Intrinsics.areEqual(str, settestmode.access100().onExtraCallbackWithResult("PRIMARY_ACCOUNT_TYPE", ""))) || !Intrinsics.areEqual(str2, String.valueOf(settestmode.access100().onExtraCallback("PRIMARY_ACCOUNT_ID", 0L)))) {
            int i2 = onTransact + 125;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i3 = onTransact;
        int i4 = i3 + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 59;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        Object obj = objArr[2];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0 && (1 & iIntValue) != 0) {
            int i4 = i2 + 35;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        IAuthTabCallback(str);
        return null;
    }

    @JvmStatic
    public static final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strOnActivityLayout = PlayerErrorCode.onActivityLayout();
        if (strOnActivityLayout.length() == 0) {
            strOnActivityLayout = PlayerErrorCode.asBinder();
        }
        if (str != null) {
            auth.IAuthTabCallback(1240363287, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, new DefaultComponentsRegistry(str, (Throwable) null, 2, (DefaultConstructorMarker) null), null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1240363286, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        }
        drawBackgroundProgress.IAuthTabCallback(addPolicy.onSessionEnded(), true);
        drawBackgroundProgress.IAuthTabCallback(onExtraCallback.access100(), true);
        if (strOnActivityLayout.length() > 0) {
            addPolicy.onSessionEnded().onNavigationEvent("UserInfo__gaNo_deleted", strOnActivityLayout);
        }
        int i4 = onTransact + 15;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @JvmStatic
    public static final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback.onTransact();
            asArray asarray = asArray.PW_6_DIGIT;
            obj.hashCode();
            throw null;
        }
        if (onExtraCallback.onTransact() != asArray.PW_6_DIGIT) {
            return false;
        }
        int i3 = IAuthTabCallbackDefault + 9;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final boolean onActivityResized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (getInterfaceDescriptor() != asArray.PW_6_DIGIT) {
            return false;
        }
        int i4 = onTransact + 67;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static /* synthetic */ void IAuthTabCallback(String str, int i, Object obj) {
        Object[] objArr = {str, Integer.valueOf(i), obj};
        onExtraCallback(1168132255, -1168132248, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static final boolean onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(657625116, -657625107, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0], iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
    }

    public static final Set<String> asBinder() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Set) onExtraCallback(608167343, -608167335, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0], iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static final void onWarmupCompleted(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        onExtraCallback(-1688500272, 1688500278, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@Nullable CheckoutResult checkoutResult, long j) {
        Object[] objArr = {checkoutResult, Long.valueOf(j)};
        onExtraCallback(-1340737858, 1340737862, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static final void onExtraCallbackWithResult(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        onExtraCallback(565009207, -565009204, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final Map<String, String> IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Map) onExtraCallback(-466877690, 466877690, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public final int extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Integer) onExtraCallback(-1270631728, 1270631729, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).intValue();
    }

    public final boolean onExtraCallback(@NotNull String str, @NotNull String str2) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(-1651830061, 1651830066, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, str, str2}, iOnExtraCallbackWithResult2, onAdViewAdDisplayFailed.onExtraCallbackWithResult())).booleanValue();
    }

    public final void IAuthTabCallbackStub(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        onExtraCallback(1658722759, -1658722757, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    static void onActivityLayout() {
        asBinder = 478308997;
    }
}
