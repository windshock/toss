package o;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.LruCache;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ComputeExpression {
    private static int IAuthTabCallbackDefault = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public static final ComputeExpression IAuthTabCallback = new ComputeExpression();
    private static final LruCache<onExtraCallbackWithResult, MessageFormat> onExtraCallbackWithResult = new LruCache<>(100);
    private static final boolean onExtraCallback = true;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i2)) | (~(i4 | i2));
        int i9 = i4 | i3;
        int i10 = (~(i3 | (~i2))) | (~(i7 | (~i4))) | (~i9);
        int i11 = i4 + i2 + i + (1350191703 * i6) + ((-44904237) * i5);
        int i12 = i11 * i11;
        int i13 = ((i4 * (-560584373)) - 948043776) + ((-560584373) * i2) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i) + ((-71041024) * i6) + ((-766246912) * i5) + (1339949056 * i12);
        int i14 = (i4 * 1657715387) + 2046152777 + (i2 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i * 1657716305) + (i6 * 1507858311) + (i5 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        return i15 != 1 ? i15 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private ComputeExpression() {
    }

    static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final Locale onExtraCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 89;
                onNavigationEvent = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                return Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback);
            }
            int i6 = IAuthTabCallback + 15;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i4 = IAuthTabCallback + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CacheKey(pattern=" + this.onWarmupCompleted + ", locale=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(locale, "");
            this.onWarmupCompleted = str;
            this.onExtraCallback = locale;
        }
    }

    static {
        int i = onWarmupCompleted + 29;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return onNavigationEvent(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (o.ComputeExpression.onExtraCallback != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (o.ComputeExpression.onExtraCallback != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r4 = IAuthTabCallback(r4, r5, r6);
        r5 = o.ComputeExpression.IAuthTabCallbackDefault + 5;
        o.ComputeExpression.onTransact = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onWarmupCompleted(@NotNull Resources resources, int i, @NotNull Object... objArr) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onTransact + 5;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(resources, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            int i4 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(resources, "");
            Intrinsics.checkNotNullParameter(objArr, "");
        }
    }

    public final String IAuthTabCallback(@NotNull Context context, int i, @NotNull Object... objArr) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 101;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return onWarmupCompleted(resources, i, Arrays.copyOf(objArr, objArr.length));
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        onWarmupCompleted(resources2, i, Arrays.copyOf(objArr, objArr.length));
        throw null;
    }

    public final String IAuthTabCallback(@NotNull Resources resources, int i, @NotNull Pair<String, ? extends Object>... pairArr) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        Map<String, ? extends Object> mapAsInterface = access8100.asInterface(pairArr);
        if (onExtraCallback) {
            int i3 = onTransact + 105;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return IAuthTabCallback(resources, i, mapAsInterface);
            }
            String strIAuthTabCallback = IAuthTabCallback(resources, i, mapAsInterface);
            int i4 = 63 / 0;
            return strIAuthTabCallback;
        }
        Object[] objArr = {this, resources, Integer.valueOf(i), mapAsInterface};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        String str = (String) IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 930197707, iOnNavigationEvent, -930197706, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i5 = IAuthTabCallbackDefault + 125;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent(@NotNull Context context, int i, @NotNull Pair<String, ? extends Object>... pairArr) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 121;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(pairArr, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return IAuthTabCallback(resources, i, (Pair<String, ? extends Object>[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        String strIAuthTabCallback = IAuthTabCallback(resources2, i, (Pair<String, ? extends Object>[]) Arrays.copyOf(pairArr, pairArr.length));
        int i4 = 19 / 0;
        return strIAuthTabCallback;
    }

    public final String onExtraCallback(@NotNull Resources resources, @NotNull String str, @NotNull Object... objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        if (!onExtraCallback) {
            return onWarmupCompleted(str, objArr);
        }
        int i4 = onTransact + 57;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) IAuthTabCallback(iOnNavigationEvent2, 1698892768, iOnNavigationEvent, -1698892766, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, resources, str, objArr}, iOnNavigationEvent3);
    }

    public final String onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull Object... objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return onExtraCallback(resources, str, Arrays.copyOf(objArr, objArr.length));
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        onExtraCallback(resources2, str, Arrays.copyOf(objArr, objArr.length));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult(@NotNull Resources resources, @NotNull String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (!onExtraCallback) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (String) IAuthTabCallback(iOnNavigationEvent2, -597516426, iOnNavigationEvent, 597516426, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, str, map}, iOnNavigationEvent3);
        }
        int i4 = onTransact + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        String strOnNavigationEvent = onNavigationEvent(resources, str, map);
        int i6 = onTransact + 3;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    public final String IAuthTabCallback(@NotNull Context context, @NotNull String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(resources, str, map);
        int i4 = onTransact + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    private final String IAuthTabCallback(Resources resources, int i, Object[] objArr) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 53;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            String string = resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            String str = (String) IAuthTabCallback(iOnNavigationEvent2, 1698892768, iOnNavigationEvent, -1698892766, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, resources, string, objArr}, iOnNavigationEvent3);
            int i4 = 92 / 0;
            return str;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) IAuthTabCallback(iOnNavigationEvent5, 1698892768, iOnNavigationEvent4, -1698892766, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, resources, string2, objArr}, iOnNavigationEvent6);
    }

    private final String IAuthTabCallback(Resources resources, int i, Map<String, ? extends Object> map) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strOnNavigationEvent = onNavigationEvent(resources, string, map);
        int i5 = onTransact + 33;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return strOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ComputeExpression computeExpression = (ComputeExpression) objArr[0];
        Resources resources = (Resources) objArr[1];
        String str = (String) objArr[2];
        Object[] objArr2 = (Object[]) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            String str2 = computeExpression.onExtraCallbackWithResult(str, PageExitListener.onExtraCallbackWithResult(resources)).format(objArr2);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return str2;
        }
        Intrinsics.checkNotNullExpressionValue(computeExpression.onExtraCallbackWithResult(str, PageExitListener.onExtraCallbackWithResult(resources)).format(objArr2), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onNavigationEvent(Resources resources, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            String str2 = onExtraCallbackWithResult(str, PageExitListener.onExtraCallbackWithResult(resources)).format(map);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return str2;
        }
        Intrinsics.checkNotNullExpressionValue(onExtraCallbackWithResult(str, PageExitListener.onExtraCallbackWithResult(resources)).format(map), "");
        throw null;
    }

    private final MessageFormat onExtraCallbackWithResult(String str, Locale locale) {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(str, locale);
        LruCache<onExtraCallbackWithResult, MessageFormat> lruCache = onExtraCallbackWithResult;
        MessageFormat messageFormat = (MessageFormat) lruCache.get(onextracallbackwithresult);
        if (messageFormat != null) {
            return messageFormat;
        }
        MessageFormat messageFormat2 = new MessageFormat(str, locale);
        lruCache.put(onextracallbackwithresult, messageFormat2);
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return messageFormat2;
    }

    private final String onNavigationEvent(Resources resources, int i, Object[] objArr) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onTransact + 61;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strOnWarmupCompleted = onWarmupCompleted(string, objArr);
        int i5 = IAuthTabCallbackDefault + 99;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return strOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Resources.NotFoundException {
        ComputeExpression computeExpression = (ComputeExpression) objArr[0];
        Resources resources = (Resources) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Map map = (Map) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            String string = resources.getString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            String str = (String) IAuthTabCallback(iOnNavigationEvent2, -597516426, iOnNavigationEvent, 597516426, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{computeExpression, string, map}, iOnNavigationEvent3);
            int i3 = 82 / 0;
            return str;
        }
        String string2 = resources.getString(iIntValue);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) IAuthTabCallback(iOnNavigationEvent5, -597516426, iOnNavigationEvent4, 597516426, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{computeExpression, string2, map}, iOnNavigationEvent6);
    }

    private final String onWarmupCompleted(String str, Object[] objArr) {
        String string;
        int i = 2 % 2;
        if (objArr.length == 0) {
            int i2 = IAuthTabCallbackDefault + 25;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder(str);
        IntIterator it = RangesKt.reversed(ArraysKt.getIndices(objArr)).iterator();
        int i3 = IAuthTabCallbackDefault + 81;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                String string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return string2;
            }
            int iNextInt = it.nextInt();
            String str3 = "{" + iNextInt + "}";
            Object obj = objArr[iNextInt];
            if (obj != null && (string = obj.toString()) != null) {
                str2 = string;
            }
            for (int iIndexOf = sb.indexOf(str3); iIndexOf >= 0; iIndexOf = sb.indexOf(str3, iIndexOf + str2.length())) {
                sb.replace(iIndexOf, str3.length() + iIndexOf, str2);
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Iterator it = map.entrySet().iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            String str4 = "{" + str3 + "}";
            if (value != null) {
                int i4 = IAuthTabCallbackDefault + 1;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                String string2 = value.toString();
                if (string2 != null) {
                    str2 = string2;
                }
            }
            int iIndexOf = sb.indexOf(str4);
            int i6 = onTransact + 115;
            while (true) {
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                if (iIndexOf >= 0) {
                    sb.replace(iIndexOf, str4.length() + iIndexOf, str2);
                    iIndexOf = sb.indexOf(str4, iIndexOf + str2.length());
                    i6 = onTransact + 37;
                }
            }
        }
    }

    private final String onWarmupCompleted(Resources resources, int i, Map<String, ? extends Object> map) {
        Object[] objArr = {this, resources, Integer.valueOf(i), map};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 930197707, iOnNavigationEvent, -930197706, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private final String onNavigationEvent(String str, Map<String, ? extends Object> map) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) IAuthTabCallback(iOnNavigationEvent2, -597516426, iOnNavigationEvent, 597516426, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, str, map}, iOnNavigationEvent3);
    }

    private final String onWarmupCompleted(Resources resources, String str, Object[] objArr) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) IAuthTabCallback(iOnNavigationEvent2, 1698892768, iOnNavigationEvent, -1698892766, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, resources, str, objArr}, iOnNavigationEvent3);
    }
}
