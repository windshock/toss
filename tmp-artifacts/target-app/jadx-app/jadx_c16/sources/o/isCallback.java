package o;

import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.benefit.R;
import im.toss.features.benefit.dto.Cards;
import im.toss.features.benefit.ui.KoreaBenefitTabViewModel;
import im.toss.features.benefit.ui.viewHolder.BaseCardItemDelegate$;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RotationVectorAbility1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class isCallback<T extends RotationVectorAbility1> extends ExoPlayerImplExternalSyntheticLambda3<T, SensorBridgeExtension3, isCallback<T>.onExtraCallbackWithResult> {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackStub;
    private static char asBinder;
    private static long asInterface;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static final String onWarmupCompleted;
    private final TdsListRowV1View.onExtraCallbackWithResult IAuthTabCallback;
    private final Function2<T, Cards.onNavigationEvent, Unit> IAuthTabCallbackDefault;
    private final Function0<Integer> onExtraCallback;
    private final Function2<T, Cards.onNavigationEvent, Unit> onTransact;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int access100 = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        byte[] bArr = $$a;
        int i2 = 4 - (s * 2);
        int i3 = s2 * 2;
        int i4 = 110 - b;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            i4 = i3;
            i = 0;
            i4 += i5;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i++;
            i5 = bArr[i2];
            i4 += i5;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        }
    }

    static {
        getInterfaceDescriptor = 1;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a((char) (6546 - TextUtils.getOffsetAfter("", 0)), 1530784341 + (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{62865, 44756, 35398, 58682, 51804, 4138, 20434, 27304, 38111, 34636, 49657, 23828, 53390, 19503, 24449, 14148, 35680, 47506, 62444, 20002, 45391, 41004, 26232, 54041, 45340, 22126, 18258, 4765, 62704, 42303, 14124, 60059, 36020, 35375, 31541, 44539, 25975, 54510, 7136, 21091, 35696, 50301, 48650, 27913, 65062, 48529, 57607, '?', 23270, 37021, 28652, 50076, 46358, 3131, 9235, 56061, 59517, 6875, 30056, 8749, 51699, 45326, 20009, 37200, 3901, 53486, 1972, 52153, 54080, 46306, 6773}, new char[]{54196, 35769, 35443, 26782}, new char[]{21761, 15850, 37467, 60441}, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) - 1888158009, new char[]{43381, 17251, 48119, 53607, 53567, 17672, 38443, 29321, 13709, 21541, 62942, 18574, 23130, 17415, 61375, 10376, 8552, 61617, 26346, 25505, 29126, 8973, 44466, 20956, 5387, 47145, 7220, 7622, 45140, 31826, 45926, 31357, 42591, 11749, 44598, 9542, 65308, 13035, 33630, 18111, 12468, 53255, 56851, 25499, 24095, 5451, 43584}, new char[]{54196, 35769, 35443, 26782}, new char[]{51047, 29950, 62863, 24531}, objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Companion = new onNavigationEvent((DefaultConstructorMarker) null);
        onExtraCallbackWithResult = 8;
        int i = access000 + 81;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int onExtraCallback(KoreaBenefitTabViewModel koreaBenefitTabViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(koreaBenefitTabViewModel);
            throw null;
        }
        int iIAuthTabCallback = IAuthTabCallback(koreaBenefitTabViewModel);
        int i3 = IAuthTabCallbackStubProxy + 73;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return iIAuthTabCallback;
    }

    protected void IAuthTabCallback(@NotNull T t) {
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public isCallback(@NotNull Function0<Integer> function0, @NotNull Function2<? super T, ? super Cards.onNavigationEvent, Unit> function2, @NotNull Function2<? super T, ? super Cards.onNavigationEvent, Unit> function22) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.onExtraCallback = function0;
        this.IAuthTabCallbackDefault = function2;
        this.onTransact = function22;
        this.IAuthTabCallback = TdsListRowV1View.onExtraCallbackWithResult.ROW2A;
    }

    public static final /* synthetic */ Function2 IAuthTabCallback(isCallback iscallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Function2<T, Cards.onNavigationEvent, Unit> function2 = iscallback.IAuthTabCallbackDefault;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 47;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public static final /* synthetic */ Function0 onExtraCallback(isCallback iscallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Function0<Integer> function0 = iscallback.onExtraCallback;
        int i5 = i3 + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return function0;
        }
        throw null;
    }

    public static final /* synthetic */ Function2 onWarmupCompleted(isCallback iscallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Function2<T, Cards.onNavigationEvent, Unit> function2 = iscallback.onTransact;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 83;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return function2;
    }

    public /* bridge */ /* synthetic */ void onExtraCallbackWithResult(Object obj, RecyclerView.ViewHolder viewHolder, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((RotationVectorAbility1) obj, (onExtraCallbackWithResult) viewHolder, list);
        int i4 = access100 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onNavigationEvent(viewGroup);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 107;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresultOnNavigationEvent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public isCallback(@NotNull KoreaBenefitTabViewModel koreaBenefitTabViewModel, @NotNull Function2<? super T, ? super Cards.onNavigationEvent, Unit> function2, @NotNull Function2<? super T, ? super Cards.onNavigationEvent, Unit> function22) {
        this((Function0<Integer>) new BaseCardItemDelegate$.ExternalSyntheticLambda0(koreaBenefitTabViewModel), function2, function22);
        Intrinsics.checkNotNullParameter(koreaBenefitTabViewModel, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
    }

    private static final int IAuthTabCallback(KoreaBenefitTabViewModel koreaBenefitTabViewModel) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        WebSocketResultEnum webSocketResultEnum = (WebSocketResultEnum) koreaBenefitTabViewModel.ICustomTabsCallback().IAuthTabCallback();
        if (i3 != 0) {
            return webSocketResultEnum.IAuthTabCallback();
        }
        webSocketResultEnum.IAuthTabCallback();
        throw null;
    }

    protected TdsListRowV1View.onExtraCallbackWithResult IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
        int i4 = i3 + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallbackwithresult;
        }
        obj.hashCode();
        throw null;
    }

    protected String onExtraCallbackWithResult(@NotNull T t) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        Object[] objArr = {t.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        String strIAuthTabCallback = ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).IAuthTabCallback();
        int i4 = IAuthTabCallbackStubProxy + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    protected String onExtraCallback(@NotNull T t) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        Object[] objArr = {t.onExtraCallbackWithResult()};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        String strOnExtraCallbackWithResult = ((Cards.Card.CardExteriorInfo) Cards.Card.onNavigationEvent(setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, setAutoCaptured.onExtraCallbackWithResult(), -1488865171, 1488865172, setAutoCaptured.onExtraCallbackWithResult())).onExtraCallbackWithResult();
        int i4 = access100 + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    /* JADX WARN: Incorrect inner types in method signature: (Landroid/view/ViewGroup;)Lo/isCallback<TT;>.onExtraCallbackWithResult; */
    protected onExtraCallbackWithResult onNavigationEvent(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this, transparentBackground.onExtraCallback(viewGroup, R.layout.benefit_card_view, false, 2, (Object) null));
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    /* JADX WARN: Incorrect inner types in method signature: (TT;Lo/isCallback<TT;>.onExtraCallbackWithResult;Ljava/util/List<Ljava/lang/Object;>;)V */
    protected void onExtraCallbackWithResult(@NotNull RotationVectorAbility1 rotationVectorAbility1, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull List list) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rotationVectorAbility1, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(list, "");
            onextracallbackwithresult.onWarmupCompleted(rotationVectorAbility1, list);
            return;
        }
        Intrinsics.checkNotNullParameter(rotationVectorAbility1, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(list, "");
        onextracallbackwithresult.onWarmupCompleted(rotationVectorAbility1, list);
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $11 + 5;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) ($$a[3] - 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 43 - TextUtils.getTrimmedLength(""), 1451 - TextUtils.indexOf("", "", 0, 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char maximumDrawingCacheSize = (char) (49123 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 45;
                    int i5 = 1495 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b3 = $$a[3];
                    byte b4 = (byte) (b3 - 1);
                    byte b5 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumDrawingCacheSize, iIndexOf, i5, 1533236389, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23971), 50 - View.resolveSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45848), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, 12576 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 39;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        asInterface = 334539903739672655L;
        IAuthTabCallbackStub = -1776194565;
        asBinder = (char) 27643;
    }
}
