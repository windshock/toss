package o;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getPattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPattern extends StyleSpan {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final response onExtraCallback;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final Lazy<Map<response, Map<Integer, Typeface>>> onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.foundation.text.style.TdsStyleSpan$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Map mapOnNavigationEvent = getPattern.onNavigationEvent();
            int i4 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return mapOnNavigationEvent;
        }
    });
    private static final Lazy<Set<Typeface>> IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.foundation.text.style.TdsStyleSpan$$ExternalSyntheticLambda1
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Set setIAuthTabCallback = getPattern.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 33 / 0;
            }
            return setIAuthTabCallback;
        }
    });

    public static /* synthetic */ Set IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface();
            obj.hashCode();
            throw null;
        }
        Set setAsInterface = asInterface();
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return setAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            return true;
        }
        int i5 = i3 + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private final boolean onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            return true;
        }
        int i6 = i4 + 47;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static /* synthetic */ Map onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Map mapIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return mapIAuthTabCallbackStub;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = ~(i6 | i3);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i6 + i3 + i + ((-1585779005) * i4) + (640148872 * i2);
        int i17 = i16 * i16;
        int i18 = (i6 * 308833806) + 153878528 + (308833806 * i3) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i) + (1159200768 * i4) + ((-734003200) * i2) + (2089549824 * i17);
        int i19 = (i6 * (-1291220770)) + 263398195 + (i3 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i * (-1291221671)) + (i4 * (-1079815989)) + (i2 * 669414472) + (i17 * 145489920);
        return i18 + ((i19 * i19) * (-1699479552)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public getPattern(int i, @Nullable response responseVar) {
        super(i);
        this.onExtraCallback = responseVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getPattern(int i, response responseVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 66 / 0;
            }
            int i5 = 2 % 2;
            responseVar = null;
        }
        this(i, responseVar);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<Set<Typeface>> lazy = IAuthTabCallback;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<Map<response, Map<Integer, Typeface>>> lazy = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return lazy;
    }

    public final response onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        response responseVar = this.onExtraCallback;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return responseVar;
    }

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            onWarmupCompleted(textPaint);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(textPaint, "");
        onWarmupCompleted(textPaint);
        int i3 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.text.style.StyleSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            onWarmupCompleted(textPaint);
        } else {
            Intrinsics.checkNotNullParameter(textPaint, "");
            onWarmupCompleted(textPaint);
            int i3 = 60 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull TextPaint textPaint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textPaint, "");
        Typeface typeface = textPaint.getTypeface();
        boolean z = onExtraCallback(getStyle()) || (typeface != null && typeface.isItalic());
        int i2 = z ? 2 : 0;
        if (this.onExtraCallback != null) {
            Map map = (Map) onExtraCallbackWithResult.onExtraCallbackWithResult(Companion).get(this.onExtraCallback);
            if (map != null) {
                int i3 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                typeface = (Typeface) map.get(Integer.valueOf(i2));
            } else {
                int i5 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                typeface = null;
            }
        } else if (!IAuthTabCallback(getStyle())) {
            int i7 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (typeface != null && typeface.isBold()) {
                onExtraCallbackWithResult onextracallbackwithresult = Companion;
                if (onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult).contains(typeface) || typeface == null) {
                    Map map2 = (Map) onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult).get(response.Bold);
                    if (map2 != null) {
                        typeface = (Typeface) map2.get(Integer.valueOf(i2));
                    }
                }
            }
        }
        textPaint.setTypeface(typeface != null ? (!z || typeface.isItalic()) ? typeface : Typeface.create(typeface, 2) : null);
        textPaint.setFakeBoldText(false);
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static final /* synthetic */ Map onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Map<response, Map<Integer, Typeface>> mapIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return mapIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ Set onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackwithresult.onExtraCallback();
                throw null;
            }
            Set<Typeface> setOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            int i3 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return setOnExtraCallback;
        }

        private final Map<response, Map<Integer, Typeface>> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Object[] objArr = new Object[0];
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = setVisitUrl.onExtraCallbackWithResult();
            if (i3 != 0) {
                throw null;
            }
            Map<response, Map<Integer, Typeface>> map = (Map) ((Lazy) getPattern.onWarmupCompleted(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, -1076825369, iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult, 1076825370)).getValue();
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return map;
            }
            obj.hashCode();
            throw null;
        }

        private final Set<Typeface> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[0];
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Set<Typeface> set = (Set) ((Lazy) getPattern.onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1928877519, setVisitUrl.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1928877519)).getValue();
            int i4 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return set;
        }
    }

    static {
        int i = asBinder + 57;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    private static final Map IAuthTabCallbackStub() {
        int i = 2 % 2;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        for (response responseVar : response.getEntries()) {
            Typeface typeface$default = response.toTypeface$default(responseVar, getCertificateChainCleanerokhttp.onExtraCallbackWithResult(), null, 2, null);
            if (typeface$default != null) {
                mapOnExtraCallback.put(responseVar, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(0, typeface$default), getWrite.IAuthTabCallback(2, Typeface.create(typeface$default, 2))}));
                int i2 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
        int i4 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Set asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Set setOnExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallbackWithResult();
            for (Map.Entry entry : onExtraCallbackWithResult.onExtraCallbackWithResult(Companion).entrySet()) {
                if (((response) entry.getKey()).getWeight() < response.Bold.getWeight()) {
                    int i3 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    setOnExtraCallbackWithResult.addAll(((Map) entry.getValue()).values());
                    int i5 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 % 2;
                    }
                }
            }
            return clearFaultAdjacentMetadata.onExtraCallbackWithResult(setOnExtraCallbackWithResult);
        }
        clearFaultAdjacentMetadata.onExtraCallbackWithResult();
        onExtraCallbackWithResult.onExtraCallbackWithResult(Companion).entrySet().iterator();
        throw null;
    }

    public static final /* synthetic */ Lazy onExtraCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return (Lazy) onWarmupCompleted(iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult(), -1928877519, iOnExtraCallbackWithResult3, new Object[0], iOnExtraCallbackWithResult, 1928877519);
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return (Lazy) onWarmupCompleted(iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult(), -1076825369, iOnExtraCallbackWithResult3, new Object[0], iOnExtraCallbackWithResult, 1076825370);
    }
}
