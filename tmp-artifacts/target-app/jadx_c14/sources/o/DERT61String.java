package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.TossReferrerTemplate;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.RealImageLoader_androidKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERT61String implements GetInputImageFromPathAsGrayScale {
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static int ICustomTabsCallback;
    private static long access100;
    private static final String asInterface;
    private static char[] extraCallback;
    public static final int onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static final String onWarmupCompleted;
    private static long readTypedObject;
    private final RealImageLoader_androidKt.IAuthTabCallback IAuthTabCallbackDefault;
    private Map<onExtraCallback, Map<String, String>> IAuthTabCallbackStub;
    private final Object IAuthTabCallbackStubProxy;
    private Map<String, TossReferrerTemplate> IAuthTabCallback_Parcel;
    private final getMediaViewVideoRendererApi access000;
    private final CoroutineExceptionHandler asBinder;
    private List<Regex> getInterfaceDescriptor;
    private List<String> onTransact;
    private static final byte[] $$a = {48, 86, 58, 71};
    private static final int $$b = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 0;
    private static int onMinimized = 1;
    private static int extraCallbackWithResult = 1;

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = DERT61String.onNavigationEvent(DERT61String.this, (access13800) this);
            if (i3 != 0) {
                int i4 = 43 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static final class IAuthTabCallback_Parcel extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            DERT61String dERT61String = DERT61String.this;
            if (i3 == 0) {
                DERT61String.onExtraCallback(dERT61String, (access13800) this);
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = DERT61String.onExtraCallback(dERT61String, (access13800) this);
            int i4 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {DERT61String.this, null, this};
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            if (i3 != 0) {
                return DERT61String.onNavigationEvent(iOnExtraCallbackWithResult2, -282288960, 282288962, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, objArr, iOnExtraCallbackWithResult4);
            }
            DERT61String.onNavigationEvent(iOnExtraCallbackWithResult2, -282288960, 282288962, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, objArr, iOnExtraCallbackWithResult4);
            throw null;
        }
    }

    static final class getInterfaceDescriptor extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = DERT61String.onExtraCallbackWithResult(DERT61String.this, (access13800) this);
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.SCREEN.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 51;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.EVENT.ordinal()] = 2;
                int i4 = onExtraCallback + 111;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    static final class writeTypedObject extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        writeTypedObject(access13800<? super writeTypedObject> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = DERT61String.IAuthTabCallback(DERT61String.this, null, this);
            int i4 = onExtraCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, int r7) {
        /*
            byte[] r0 = o.DERT61String.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r5 = r5 * 4
            int r5 = 97 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.$$c(int, int, int):java.lang.String");
    }

    static {
        ICustomTabsCallback = 0;
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{7804, 36878, 757, 46208, 10001, 55755, 19362, 64117, 27869, 7855, 37247, 831, 46495, 9285, 54843, 18685}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36433, objArr);
        asInterface = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{7795, 41276, 24809, 9119, 58177, 41710, 26037, 9582, 58369, 42970, 26464, 9786, 59882, 43164, 26708, 11233, 60069, 43647, 27909, 11475, 60529, 44844, 28414, 12695, 61769, 45281, 29607, 13180}, (ViewConfiguration.getScrollBarSize() >> 8) + 48973, objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(Color.rgb(0, 0, 0) + 16777239, (char) (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0), objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{7795, 10206, 27949, 45941, 63689, 15876, 17505, 36284, 54033, 6472, 24227, 25837, 43591, 62367, 14839, 32565, 33925, 51947, 4129, 22924, 40927, 42303, 60261, 12509, 30209, 48247, 50611, 2838}, 14767 - (Process.myPid() >> 22), objArr4);
        IAuthTabCallback = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new char[]{7804, 36878, 757, 46208, 10001, 55755, 19362, 64117, 27869, 7855, 37247, 831, 46495, 9285, 54843, 18685}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36432, objArr5);
        onNavigationEvent = ((String) objArr5[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallback = 8;
        int i = extraCallbackWithResult + 61;
        ICustomTabsCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i2);
        int i12 = i5 | i11;
        int i13 = (~(i5 | i2)) | (~(i7 | i8 | i9)) | i11 | (~(i3 | i5));
        int i14 = i3 + i2 + i + (1272450877 * i4) + ((-51365948) * i6);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i3) + 922746880 + ((-1437248296) * i2) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i) + ((-1881145344) * i4) + ((-578813952) * i6) + ((-124846080) * i15);
        int i17 = (i3 * 1187242746) + 1002376400 + (i2 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i * 1187242569) + (i4 * (-1484311963)) + (i6 * 1141305060) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    @Inject
    public DERT61String(@NotNull getMediaViewVideoRendererApi getmediaviewvideorendererapi) {
        Intrinsics.checkNotNullParameter(getmediaviewvideorendererapi, "");
        this.access000 = getmediaviewvideorendererapi;
        this.asBinder = new ICustomTabsCallback(CoroutineExceptionHandler.extraCallbackWithResult);
        this.IAuthTabCallbackDefault = RealImageLoader_androidKt.IAuthTabCallback.onExtraCallbackWithResult;
        this.IAuthTabCallbackStub = new LinkedHashMap();
        this.onTransact = CollectionsKt.emptyList();
        this.getInterfaceDescriptor = CollectionsKt.emptyList();
        this.IAuthTabCallbackStubProxy = new Object();
    }

    public static final /* synthetic */ Object IAuthTabCallback(DERT61String dERT61String, onExtraCallback onextracallback, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            dERT61String.onExtraCallback(onextracallback, (access13800<? super Unit>) access13800Var);
            throw null;
        }
        Object objOnExtraCallback = dERT61String.onExtraCallback(onextracallback, (access13800<? super Unit>) access13800Var);
        int i3 = writeTypedObject + 25;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback(DERT61String dERT61String, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = dERT61String.onWarmupCompleted((access13800<? super Unit>) access13800Var);
        int i4 = writeTypedObject + 53;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DERT61String dERT61String = (DERT61String) objArr[0];
        onExtraCallback onextracallback = (onExtraCallback) objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1746408424, 1746408425, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{dERT61String, onextracallback, access13800Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1746408424, 1746408425, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{dERT61String, onextracallback, access13800Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(DERT61String dERT61String, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return dERT61String.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        }
        dERT61String.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(DERT61String dERT61String, onExtraCallback onextracallback) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        dERT61String.IAuthTabCallback(onextracallback);
        int i4 = onMinimized + 65;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(DERT61String dERT61String, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            dERT61String.onExtraCallback((access13800<? super Unit>) access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = dERT61String.onExtraCallback((access13800<? super Unit>) access13800Var);
        int i3 = onMinimized + 117;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public static final /* synthetic */ getMediaViewVideoRendererApi onWarmupCompleted(DERT61String dERT61String) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getMediaViewVideoRendererApi getmediaviewvideorendererapi = dERT61String.access000;
        if (i3 != 0) {
            return getmediaviewvideorendererapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ onExtraCallback $it;
        int label;
        private static char[] onExtraCallback = {51244, 64916, 51240, 64989, 64984, 51245, 64990, 64987, 64986, 51243, 64967, 64976, 64965, 64982, 51242, 64988, 64964, 64961, 64978, 64966, 64960, 64977, 64915, 64991, 64981};
        private static char onWarmupCompleted = 51244;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(onExtraCallback onextracallback, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$it = onextracallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = DERT61String.this.new onWarmupCompleted(this.$it, access13800Var);
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{'\r', 16, 13820, 13820, 20, '\f', 17, 20, 2, 16, '\n', 23, 16, '\t', 11, 3, 23, 22, 14, 23, 16, 18, '\f', 23, 3, 6, 2, '\r', 19, 0, 11, 3, 21, 17, 5, '\r', '\f', 2, '\n', 16, 18, 16, 15, 14, '\r', '\b', 13829}, (byte) (View.MeasureSpec.getMode(0) + 6), MotionEvent.axisFromString("") + 48, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                DERT61String.onExtraCallbackWithResult(DERT61String.this, this.$it);
                DERT61String dERT61String = DERT61String.this;
                onExtraCallback onextracallback = this.$it;
                this.label = 1;
                if (DERT61String.IAuthTabCallback(dERT61String, onextracallback, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = $11 + 125;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, ExpandableListView.getPackedPositionGroup(0L) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, 23138 - TextUtils.lastIndexOf("", '0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i7 = $10 + 103;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        int i9 = $11 + 119;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24824), (KeyEvent.getMaxKeyCode() >> 16) + 74, 8088 - TextUtils.getOffsetBefore("", 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i11 = $11 + 43;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 30 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 19488 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                } else {
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    int i18 = $10 + 125;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    obj2 = obj;
                }
            }
            int i20 = 0;
            while (i20 < i) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
                int i21 = $10 + 105;
                $11 = i21 % 128;
                int i22 = i21 % 2;
            }
            objArr[0] = new String(cArr4);
        }
    }

    public static final class ICustomTabsCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static final byte[] $$a = {4, -66, -36, 8};
        private static final int $$b = 11;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onNavigationEvent = {60824, 47667, 17059, 60175, 45969, 22546, 57488, 35102, 20977, 65114, 34529, 12152, 63447, 40020, 9409, 52574};
        private static long onExtraCallback = -2216393604576789924L;

        private static String $$c(short s, byte b, int i) {
            byte[] bArr = $$a;
            int i2 = (b * 4) + 97;
            int i3 = 3 - (i * 3);
            int i4 = s * 4;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i2 += i4;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                i3++;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i2 += bArr[i3];
            }
        }

        public ICustomTabsCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a(Color.blue(1), 32 / Gravity.getAbsoluteGravity(1, 0), (char) Drawable.resolveOpacity(0, 0), objArr);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr[0]).intern(), th.getMessage(), th, (Map) null, 81, (Object) null);
            } else {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(Color.blue(0), Gravity.getAbsoluteGravity(0, 0) + 16, (char) Drawable.resolveOpacity(0, 0), objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray2, ((String) objArr2[0]).intern(), th.getMessage(), th, (Map) null, 8, (Object) null);
            }
            int i3 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - Process.getGidForName("")), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16728093) - Color.rgb(0, 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Gravity.getAbsoluteGravity(0, 0)), 44 - TextUtils.indexOf("", "", 0, 0), 1494 - (Process.myTid() >> 22), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i7 = $11 + 29;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr);
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int[] onNavigationEvent = {-1929568547, 1304147643, -752313670, 1939815131, -11911835, -1741200110, 861921959, -1668471543, -1309034733, -190135199, 1198460663, 194174807, 1933133814, 569985474, -1838324701, -705871050, -1013994704, 1173661287};
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = DERT61String.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 85;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{-386990059, -1581550158, -2124700618, -1818317017, 920095901, -291120223, -1207089741, 498777805, -1752879867, -160146060, 1874788893, 711427715, 1160974283, -804818997, -1903031474, -610819334, 675751616, 1430810615, 552522052, 316577410, 761770939, -935844345, 902877643, -1170703585}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 47, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i6 = i3 + 37;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                int i8 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                DERT61String dERT61String = DERT61String.this;
                this.label = 1;
                if (DERT61String.onExtraCallback(dERT61String, (access13800) this) == objOnWarmupCompleted) {
                    int i10 = onExtraCallbackWithResult + 71;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onNavigationEvent;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr3 != null) {
                int i6 = $11 + 53;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 72 - (ViewConfiguration.getEdgeSlop() >> 16), 8848 - Gravity.getAbsoluteGravity(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7++;
                        i4 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onNavigationEvent;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i8]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", i5, i5), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 71, 8848 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i8++;
                    i5 = 0;
                }
                int i9 = $11 + 21;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                iArr5 = iArr6;
                i2 = 0;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i11 = 0;
                for (int i12 = 16; i11 < i12; i12 = 16) {
                    int i13 = $11 + 53;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - KeyEvent.getDeadChar(0, 0)), KeyEvent.getDeadChar(0, 0) + 39, ((Process.getThreadPriority(0) + 20) >> 6) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i11 += 11;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                        try {
                            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22253), (ViewConfiguration.getTapTimeout() >> 16) + 39, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                            i11++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                }
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (Process.myPid() >> 22)), 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 7398 - (ViewConfiguration.getScrollBarSize() >> 8), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onWarmupCompleted;
        int label;
        private static final byte[] $$a = {25, 43, 92, -56};
        private static final int $$b = 51;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent = 909003510;
        private static int onExtraCallbackWithResult = -1538795398;
        private static int IAuthTabCallback = 1071250651;
        private static byte[] onExtraCallback = {-1, 13, -3, -9, 14, -11, 11, 4, 75, -80, -4, 3, -6, 95, -15, -54, -14, -12, -15, 0, 13, 74, 15, -77, -5, 11, 1, 9, 11, 74, -15, -54, -16, -16, 10, 6, -5, 67, 15, -71, -13, 92, -68, 8, 3, -10, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, byte r7, byte r8) {
            /*
                int r7 = r7 * 2
                int r7 = 115 - r7
                int r6 = r6 * 2
                int r6 = r6 + 4
                int r8 = r8 * 3
                int r0 = r8 + 1
                byte[] r1 = o.DERT61String.IAuthTabCallbackDefault.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2b:
                int r6 = -r6
                int r6 = r6 + r3
                int r7 = r7 + 1
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.IAuthTabCallbackDefault.$$c(int, byte, byte):java.lang.String");
        }

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = DERT61String.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = IAuthTabCallbackDefault + 23;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 57;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackDefault + 113;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 85;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallbackDefault + 51;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onTransact + 1;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1838574850 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1684134800, (-67) - ExpandableListView.getPackedPositionType(0L), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                DERT61String dERT61String = DERT61String.this;
                this.label = 1;
                if (DERT61String.onExtraCallbackWithResult(dERT61String, (access13800) this) == objOnWarmupCompleted) {
                    int i5 = onTransact + 1;
                    IAuthTabCallbackDefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallbackDefault + 7;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            int i5;
            int i6 = 2;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "", 0, 0) + 42, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    byte[] bArr = onExtraCallback;
                    char c = '0';
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i8 = 0;
                        while (i8 < length) {
                            int i9 = $11 + 67;
                            $10 = i9 % 128;
                            int i10 = i9 % i6;
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12843), 54 - TextUtils.lastIndexOf("", c), 2166 - MotionEvent.axisFromString(""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8++;
                            i6 = 2;
                            c = '0';
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i11 = $10 + 65;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            byte[] bArr3 = onExtraCallback;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 43425), 41 - TextUtils.indexOf((CharSequence) "", '0'), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - 4629411779493505016L)) >>> ((int) (onExtraCallbackWithResult - 4629411779493505016L));
                        } else {
                            byte[] bArr4 = onExtraCallback;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 43424), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i5;
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i12 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j));
                    if (z) {
                        int i13 = $10 + 53;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 86 - (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onExtraCallback;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr6[i15] = (byte) (bArr5[i15] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    boolean z2 = bArr5 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i16 = $11 + 41;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        if (!(!z2)) {
                            byte[] bArr7 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = onExtraCallback.getEntries().iterator();
        while (it.hasNext()) {
            maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback()), this.asBinder, (setRandomHost) null, new onWarmupCompleted((onExtraCallback) it.next(), null), 2, (Object) null);
        }
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback()), this.asBinder, (setRandomHost) null, new IAuthTabCallback(null), 2, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback()), this.asBinder, (setRandomHost) null, new IAuthTabCallbackDefault(null), 2, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback()), this.asBinder, (setRandomHost) null, new IAuthTabCallbackStub(null), 2, (Object) null);
        int i4 = onMinimized + 57;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult = 8786196621798866309L;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = DERT61String.this.new IAuthTabCallbackStub(access13800Var);
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 30 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 61;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{15122, 15217, 6383, 40455, 45009, 43323, 8470, 41647, 16094, 15052, 34294, 38739, 3965, 9380, 58256, 64860, 29963, 19103, 63924, 55532, 21410, 29052, 55144, 50817, 47561, 38728, 11532, 11427, 42989, 48399, 2859, 2761, 36225, 41961, 26308, 28796, 59922, 51673, 31988, 24067, 53310, 61418, 23194, 17532, 15880, 5529, 45216, 41915, 9463, 14460, 36436}, TextUtils.getOffsetBefore("", 0) + 1, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i6 = i4 + 31;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                DERT61String dERT61String = DERT61String.this;
                this.label = 1;
                if (DERT61String.onNavigationEvent(dERT61String, (access13800) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onExtraCallback + 115;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 33;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 3;
            }
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $10 + 71;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - ExpandableListView.getPackedPositionType(0L)), 84 - (ViewConfiguration.getEdgeSlop() >> 16), 21234 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - ExpandableListView.getPackedPositionGroup(0L)), (KeyEvent.getMaxKeyCode() >> 16) + 19, 8808 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }
    }

    private final void IAuthTabCallback(onExtraCallback onextracallback) throws Throwable {
        Object obj;
        Object objOnExtraCallback;
        int i = 2 % 2;
        String cacheKey = onextracallback.getCacheKey();
        try {
            Result.Companion companion = Result.Companion;
            RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback = enableExclusivePropsUpdateAndroid.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{7804, 36878, 757, 46208, 10001, 55755, 19362, 64117, 27869, 7855, 37247, 831, 46495, 9285, 54843, 18685}, 36433 - KeyEvent.keyCodeFromString(""), objArr);
            String strIAuthTabCallback = RealImageLoaderKtaddServiceLoaderComponentslambda3inlinedsortedByDescending1.IAuthTabCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback, ((String) objArr[0]).intern(), cacheKey);
            if (strIAuthTabCallback != null) {
                wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                objOnExtraCallback = wie2VarOnExtraCallback.onExtraCallback(new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout), strIAuthTabCallback);
            } else {
                objOnExtraCallback = null;
            }
            obj = Result.constructor-impl(objOnExtraCallback);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback2 = enableExclusivePropsUpdateAndroid.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{7804, 36878, 757, 46208, 10001, 55755, 19362, 64117, 27869, 7855, 37247, 831, 46495, 9285, 54843, 18685}, TextUtils.getOffsetAfter("", 0) + 36433, objArr2);
            RealImageLoaderKtaddServiceLoaderComponentslambda3inlinedsortedByDescending1.onNavigationEvent(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback2, ((String) objArr2[0]).intern(), cacheKey, "", this.IAuthTabCallbackDefault);
            int i2 = onMinimized + 5;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = writeTypedObject + 119;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        Map<String, String> map = (Map) obj;
        if (map != null) {
            this.IAuthTabCallbackStub.put(onextracallback, map);
        }
    }

    public static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends String>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult = 1716904844658400998L;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DERT61String this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access000(access13800 access13800Var, DERT61String dERT61String) {
            super(2, access13800Var);
            this.this$0 = dERT61String;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(access13800Var, this.this$0);
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return access000Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<? extends String>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 57;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<? extends String>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 55;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $11 + 17;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45811), Color.red(0) + 84, 21233 - Color.red(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - MotionEvent.axisFromString("")), 19 - (KeyEvent.getMaxKeyCode() >> 16), 8808 - ((Process.getThreadPriority(0) + 20) >> 6), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i8 = $11 + 15;
            $10 = i8 % 128;
            if (i8 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i9 = 98 / 0;
                objArr[0] = str;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 63;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{5490, 5393, 43905, 3594, 16214, 29934, 27711, 33530, 38503, 40429, 56389, 5291, 14853, 32457, 17431, 48272, 54271, 50958, 11775, 9596, 19442, 44905, 38215, 52693, 58197, 14273, 32047, 30155, 39077, 38962, 59132, 57909, 12421, 24680, 20063, 35484, 43026, 51420, 13867, 13159, 16882, 20851, 40841, 56100, 63888, 14740, 1863, 17367, 37155, 33229, 61247}, View.MeasureSpec.getMode(0), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getMediaViewVideoRendererApi getmediaviewvideorendererapiOnWarmupCompleted = DERT61String.onWarmupCompleted(this.this$0);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = getmediaviewvideorendererapiOnWarmupCompleted.asBinder(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    return (List) objOnTransact;
                }
                Object[] objArr2 = new Object[1];
                a(new char[]{50345, 50375, 56956, 31715, 12530, 31562, 36793, 21281, 58253, 32363, 54255, 63331, 60311, 2857, 19362, 24389, 563, 45819, 8734, 50878, 39528, 55941, 39666, 11797, 12949, 16929, 29390, 38403, 18742, 60872, 59675, 427, 57668, 5522, 16882, 26909, 31133, 48431, 14742, 53488, 36961, 9413, 36897, 14521, 10325, 19567, 2296, 40971, 16626, 62513, 57490, 3057, 57132, 8149, 22322, 29596, 30542, 34656, 53213, 56067, 36821, 12047, 42885, 17137, 9805, 22229, 7729, 43657, 48709, 65151, 63176, 4731, 54994, 26138, 28028, 32228, 27927, 37281, 50536}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr2);
                throw new NullPointerException(((String) objArr2[0]).intern());
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(List.class, Object.class)) {
                    int i5 = onWarmupCompleted + 19;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (!Intrinsics.areEqual(List.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends TossReferrerTemplate>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -5385364209302654717L;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DERT61String this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access100(access13800 access13800Var, DERT61String dERT61String) {
            super(2, access13800Var);
            this.this$0 = dERT61String;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<? extends TossReferrerTemplate>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            access100 access100VarCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                access100VarCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = access100VarCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 63 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = new access100(access13800Var, this.this$0);
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $11 + 89;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getTouchSlop() >> 8) + 24, 19627 - Color.red(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 59 - (Process.myTid() >> 22), 6382 - ((byte) KeyEvent.getModifierMetaStateMask()), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $11 + 9;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $11 + 89;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (Process.myPid() >> 22) + 59, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                getMediaViewVideoRendererApi getmediaviewvideorendererapiOnWarmupCompleted = DERT61String.onWarmupCompleted(this.this$0);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = getmediaviewvideorendererapiOnWarmupCompleted.onExtraCallback(this);
                if (obj == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 35;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 56 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(new char[]{13399, 31482, 43270, 55381, 3752, 48427, 60481, 4829, 16747, 61537, 9863, 21954, 33909, 51898, 31171, 43090, 57060, 3529, 48159, 58031, 4599, 16413, 63323, 9645, 21627, 39754, 51612, 30775, 44927, 56716, 3283, 45858, 57844, 4300, 18275, 62893, 9408, 27487, 39341, 51442, 32542, 44636, 56567, 805, 45641, 57497, 5923}, 20142 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i7 = onExtraCallbackWithResult + 37;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    int i9 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return (List) objOnTransact;
                }
                Object[] objArr2 = new Object[1];
                a(new char[]{13402, 63856, 44602, 21451, 208, 13730, 64371, 43021, 24018, 738, 14250, 58639, 43546, 24364, 3258, 12680, 59205, 37894, 22834, 3767, 13204, 57694, 38434, 23357, 2243, 15763, 58083, 36977, 17693, 2773, 16358, 60667, 37472, 18204, 29894, 14818, 61168, 40010, 16669, 30263, 15344, 59524, 40528, 17185, 28731, 9670, 60054, 40871, 19809, 29238, 10194, 54430, 39343, 20351, 31761, 8605, 54976, 39860, 18781, 32267, 9076, 53488, 34183, 19221, 30720, 11562, 53989, 34708, 46366, 31330, 12093, 56529, 33177, 46819, 25706, 10525, 57049, 33770, 45233, 26190, 11030, 55451, 36306, 45752, 24659, 5378, 55824, 36854, 48266, 25176, 6012, 50221, 35277, 48779, 25502, 4478, 50745, 35797, 47258, 28070, 4964, 49156, 62860}, 52577 - AndroidCharacter.getMirror('0'), objArr2);
                throw new NullPointerException(((String) objArr2[0]).intern());
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(List.class, Object.class)) {
                    int i11 = onExtraCallback + 65;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        Intrinsics.areEqual(List.class, Unit.class);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(List.class, Unit.class)) {
                        int i12 = onExtraCallback + 97;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0', 0) + 25, TextUtils.indexOf((CharSequence) "", '0') + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access100 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 59, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 29;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 107;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 59, (ViewConfiguration.getPressedStateDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = 11 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 6383 - KeyEvent.keyCodeFromString(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(1:10)(2:5|(2:7|(1:9)(0))(2:75|76))|11|77|(2:13|(2:15|(16:17|81|18|19|45|56|(1:58)|59|(1:63)|64|(1:66)(1:67)|68|(1:70)|71|72|73)(2:24|25))(1:26))(3:27|(0)|74)|29|(4:31|(2:33|(1:38))(2:36|(0))|72|73)|40|79|41|(13:44|45|56|(0)|59|(2:61|63)|64|(0)(0)|68|(0)|71|72|73)|74|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        if (r0.isEmpty() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103 A[PHI: r0
      0x0103: PHI (r0v17 java.util.Map<java.lang.String, java.lang.String>) = (r0v16 java.util.Map<java.lang.String, java.lang.String>), (r0v21 java.util.Map<java.lang.String, java.lang.String>) binds: [B:37:0x0101, B:34:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(o.DERT61String.onExtraCallback r20, o.access13800<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onExtraCallback(o.DERT61String$onExtraCallback, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.access13800<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $10 + 51;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(extraCallback[i2 << i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 59697), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(readTypedObject), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 46135), ExpandableListView.getPackedPositionType(0L) + 31, (-16756996) - Color.rgb(0, 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.green(0) + 44, 1494 - TextUtils.indexOf("", "", 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(extraCallback[i2 + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (KeyEvent.getMaxKeyCode() >> 16)), 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(readTypedObject), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.getCapsMode("", 0, 0) + 31, ExpandableListView.getPackedPositionGroup(0L) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.combineMeasuredStates(0, 0)), 44 - Color.alpha(0), 1494 - (KeyEvent.getMaxKeyCode() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i7 = $11 + 47;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49122), 44 - TextUtils.getOffsetAfter("", 0), ImageFormat.getBitsPerPixel(0) + 1495, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                int i8 = 85 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback8 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 49124), 44 - Color.blue(0), 1494 - TextUtils.getCapsMode("", 0, 0), -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    public static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ onExtraCallback $logType$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DERT61String this$0;
        private static final byte[] $$a = {114, 69, -115, -114};
        private static final int $$b = 157;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static int onExtraCallback = 478308888;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, int r8) {
            /*
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r6 = r6 * 2
                int r6 = r6 + 105
                int r8 = r8 * 2
                int r8 = 1 - r8
                byte[] r0 = o.DERT61String.onTransact.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L2c:
                int r4 = -r4
                int r7 = r7 + r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onTransact.$$c(byte, int, int):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(access13800 access13800Var, onExtraCallback onextracallback, DERT61String dERT61String) {
            super(2, access13800Var);
            this.$logType$inlined = onextracallback;
            this.this$0 = dERT61String;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(access13800Var, this.$logType$inlined, this.this$0);
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onTransact.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
        
            if (r14 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
        
            if (r14 == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(o.access13800<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    private final void onNavigationEvent() {
        Object obj;
        Object objOnExtraCallback;
        synchronized (this.IAuthTabCallbackStubProxy) {
            if (this.IAuthTabCallback_Parcel != null) {
                Unit unit = Unit.INSTANCE;
            } else {
                Object obj2 = null;
                try {
                    Result.Companion companion = Result.Companion;
                    RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback = enableExclusivePropsUpdateAndroid.onExtraCallback();
                    Object[] objArr = new Object[1];
                    a(new char[]{7804, 36878, 757, 46208, 10001, 55755, 19362, 64117, 27869, 7855, 37247, 831, 46495, 9285, 54843, 18685}, 36434 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    a(new char[]{7795, 41276, 24809, 9119, 58177, 41710, 26037, 9582, 58369, 42970, 26464, 9786, 59882, 43164, 26708, 11233, 60069, 43647, 27909, 11475, 60529, 44844, 28414, 12695, 61769, 45281, 29607, 13180}, 48973 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                    String strIAuthTabCallback = RealImageLoaderKtaddServiceLoaderComponentslambda3inlinedsortedByDescending1.IAuthTabCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback, strIntern, ((String) objArr2[0]).intern());
                    if (strIAuthTabCallback != null) {
                        wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                        wie2VarOnExtraCallback.onExtraCallback();
                        objOnExtraCallback = wie2VarOnExtraCallback.onExtraCallback(new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, TossReferrerTemplate.Companion.serializer()), strIAuthTabCallback);
                    } else {
                        objOnExtraCallback = null;
                    }
                    obj = Result.constructor-impl(objOnExtraCallback);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(obj) != null) {
                    RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback2 = enableExclusivePropsUpdateAndroid.onExtraCallback();
                    Object[] objArr3 = new Object[1];
                    a(new char[]{7804, 36878, 757, 46208, 10001, 55755, 19362, 64117, 27869, 7855, 37247, 831, 46495, 9285, 54843, 18685}, TextUtils.indexOf("", "") + 36433, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    a(new char[]{7795, 41276, 24809, 9119, 58177, 41710, 26037, 9582, 58369, 42970, 26464, 9786, 59882, 43164, 26708, 11233, 60069, 43647, 27909, 11475, 60529, 44844, 28414, 12695, 61769, 45281, 29607, 13180}, Process.getGidForName("") + 48974, objArr4);
                    RealImageLoaderKtaddServiceLoaderComponentslambda3inlinedsortedByDescending1.onNavigationEvent(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1OnExtraCallback2, strIntern2, ((String) objArr4[0]).intern(), "", this.IAuthTabCallbackDefault);
                }
                if (!Result.onExtraCallback(obj)) {
                    obj2 = obj;
                }
                Map<String, TossReferrerTemplate> mapOnNavigationEvent = (Map) obj2;
                if (mapOnNavigationEvent == null) {
                    mapOnNavigationEvent = access8100.onNavigationEvent();
                }
                this.IAuthTabCallback_Parcel = mapOnNavigationEvent;
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends String>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DERT61String this$0;
        private static char[] onWarmupCompleted = {32405, 32407, 32396, 32592, 32388, 32385, 32585, 32390, 32395, 32389, 32443, 32387, 32406, 32394, 32399, 32386, 32442, 32397, 32441, 32392, 32579, 32447, 32384, 32578, 32620, 32636, 32613, 32393, 32626};
        private static int onNavigationEvent = -1184334032;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onExtraCallback = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(access13800 access13800Var, DERT61String dERT61String) {
            super(2, access13800Var);
            this.this$0 = dERT61String;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(access13800Var, this.this$0);
            int i2 = IAuthTabCallback + 81;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 79;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super List<? extends String>> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = asbinderCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 75 / 0;
            } else {
                objInvokeSuspend = asbinderCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 125;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getMediaViewVideoRendererApi getmediaviewvideorendererapiOnWarmupCompleted = DERT61String.onWarmupCompleted(this.this$0);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = getmediaviewvideorendererapiOnWarmupCompleted.onNavigationEvent((access13800<? super BaseApiResponse<List<String>>>) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i3 = IAuthTabCallbackStub + 61;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i5 = IAuthTabCallback + 81;
            IAuthTabCallbackStub = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    baseApiResponse.onTransact();
                    throw null;
                }
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact == null) {
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-99, -100, -112, -113, -120, -123, -101, -104, -112, -113, -125, -123, -122, -110, -102, -123, -118, -113, -103, -104, -118, -112, -122, -113, -123, -127, -119, -125, -125, -122, -127, -104, -112, -113, -125, -123, -122, -110, -124, -119, -105, -106, -123, -124, -125, -125, -117, -112, -107, -112, -122, -112, -124, -122, -123, -124, -123, -118, -126, -127, -124, -119, -115, -124, -123, -122, -112, -112, -126, -127, -124, -125, -125, -117, -112}, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                    throw new NullPointerException(((String) objArr2[0]).intern());
                }
                int i6 = IAuthTabCallback + 7;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return (List) objOnTransact;
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(List.class, Object.class) || Intrinsics.areEqual(List.class, Unit.class)) {
                    return Unit.INSTANCE;
                }
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            int i3 = -16777216;
            Object obj = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 101;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (i3 - Color.rgb(0, 0, 0)), ImageFormat.getBitsPerPixel(0) + 78, 20952 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 77 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    }
                    i3 = -16777216;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 75 - (ViewConfiguration.getLongPressTimeout() >> 16), 16036 - ExpandableListView.getPackedPositionChild(0L), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            int i6 = 1052772399;
            if (onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 63 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i7 = $10 + 19;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i6 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                String str = new String(cArr5);
                int i9 = $11 + 9;
                $10 = i9 % 128;
                if (i9 % 2 == 0) {
                    objArr[0] = str;
                    return;
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 79;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 63 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12214 - (ViewConfiguration.getEdgeSlop() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        }
    }

    public static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends String>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {-1053171054, -1546139306, 1478667906, -452220587, 545328202, -1004296510, -1411323671, -180646221, 1720327615, 800580530, -1843741423, -1470249571, -1498424671, -367277560, 2104763994, -982444154, 117294462, 1218411551};
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ onExtraCallback $logType$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DERT61String this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallbackWithResult(access13800 access13800Var, onExtraCallback onextracallback, DERT61String dERT61String) {
            super(2, access13800Var);
            this.$logType$inlined = onextracallback;
            this.this$0 = dERT61String;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(access13800Var, this.$logType$inlined, this.this$0);
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return extracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Map<String, ? extends String>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        
            if (r14 == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        
            if (r14 == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
        
            if (r14 == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 514
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.extraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = IAuthTabCallback;
            long j = 0;
            int i5 = -1469660336;
            int i6 = 0;
            if (iArr3 != null) {
                int i7 = $10 + 33;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(j), 72 - View.MeasureSpec.getSize(0), 8848 - View.combineMeasuredStates(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8++;
                        j = 0;
                        i5 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = IAuthTabCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $11 + 103;
                    $10 = i10 % 128;
                    int i11 = i10 % i3;
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(iArr5[i9]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 72, 8847 - TextUtils.indexOf((CharSequence) "", '0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i9++;
                        int i12 = $11 + 67;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        i3 = 2;
                        i6 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = i6;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i14 = 0;
                for (int i15 = 16; i14 < i15; i15 = 16) {
                    int i16 = $10 + 125;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39, 10301 - (ViewConfiguration.getTouchSlop() >> 8), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i14 += 54;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22300 - AndroidCharacter.getMirror('0')), 38 - TextUtils.indexOf((CharSequence) "", '0'), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i14++;
                    }
                }
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 4033), 78 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(o.access13800<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onExtraCallback(o.access13800):java.lang.Object");
    }

    public boolean onExtraCallbackWithResult(@Nullable downloadZip downloadzip) {
        String str;
        int i = 2 % 2;
        Map<String, String> map = this.IAuthTabCallbackStub.get(onExtraCallback.SCREEN);
        if (map != null) {
            str = (String) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1929884348, -1929884348, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, map, downloadzip}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
            int i2 = onMinimized + 111;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = writeTypedObject + 85;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        return str != null;
    }

    public boolean onExtraCallback(@Nullable downloadZip downloadzip) {
        String str;
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.IAuthTabCallbackStub.get(onExtraCallback.EVENT);
        if (map != null) {
            str = (String) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1929884348, -1929884348, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, map, downloadzip}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        int i4 = onMinimized + 61;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String IAuthTabCallback(@org.jetbrains.annotations.Nullable o.downloadZip r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.DERT61String.onMinimized
            int r1 = r1 + 35
            int r2 = r1 % 128
            o.DERT61String.writeTypedObject = r2
            int r1 = r1 % r0
            java.util.Map<o.DERT61String$onExtraCallback, java.util.Map<java.lang.String, java.lang.String>> r1 = r11.IAuthTabCallbackStub
            o.DERT61String$onExtraCallback r2 = o.DERT61String.onExtraCallback.SCREEN
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            r2 = 0
            if (r1 == 0) goto L6d
            int r3 = o.DERT61String.onMinimized
            int r3 = r3 + 5
            int r4 = r3 % 128
            o.DERT61String.writeTypedObject = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L4b
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r1, r12}
            int r8 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r4 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r7 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r10 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            r6 = -1929884348(0xffffffff8cf84d44, float:-3.8256953E-31)
            r5 = 1929884348(0x7307b2bc, float:1.0751118E31)
            java.lang.Object r1 = onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = (java.lang.String) r1
            r3 = 95
            int r3 = r3 / 0
            if (r1 != 0) goto Lcc
            goto L6d
        L4b:
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r1, r12}
            int r8 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r4 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r7 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r10 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            r6 = -1929884348(0xffffffff8cf84d44, float:-3.8256953E-31)
            r5 = 1929884348(0x7307b2bc, float:1.0751118E31)
            java.lang.Object r1 = onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Lcc
        L6d:
            java.util.Map<o.DERT61String$onExtraCallback, java.util.Map<java.lang.String, java.lang.String>> r1 = r11.IAuthTabCallbackStub
            o.DERT61String$onExtraCallback r3 = o.DERT61String.onExtraCallback.EVENT
            java.lang.Object r1 = r1.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto Lcb
            int r3 = o.DERT61String.writeTypedObject
            int r3 = r3 + 85
            int r4 = r3 % 128
            o.DERT61String.onMinimized = r4
            int r3 = r3 % r0
            if (r3 != 0) goto La9
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r1, r12}
            int r8 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r4 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r7 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r10 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            r6 = -1929884348(0xffffffff8cf84d44, float:-3.8256953E-31)
            r5 = 1929884348(0x7307b2bc, float:1.0751118E31)
            java.lang.Object r12 = onNavigationEvent(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r12 = (java.lang.String) r12
            r1 = 22
            int r1 = r1 / 0
            goto Lc9
        La9:
            java.lang.Object[] r8 = new java.lang.Object[]{r11, r1, r12}
            int r7 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r3 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r6 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            int r9 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()
            r5 = -1929884348(0xffffffff8cf84d44, float:-3.8256953E-31)
            r4 = 1929884348(0x7307b2bc, float:1.0751118E31)
            java.lang.Object r12 = onNavigationEvent(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r12 = (java.lang.String) r12
        Lc9:
            r1 = r12
            goto Lcc
        Lcb:
            r1 = r2
        Lcc:
            java.util.List<java.lang.String> r12 = r11.onTransact
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r12 = kotlin.collections.CollectionsKt.contains(r12, r1)
            r12 = r12 ^ 1
            if (r12 == 0) goto Le2
            int r12 = o.DERT61String.writeTypedObject
            int r12 = r12 + 3
            int r2 = r12 % 128
            o.DERT61String.onMinimized = r2
            int r12 = r12 % r0
            return r1
        Le2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.IAuthTabCallback(o.downloadZip):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r3 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r3 = o.DERT61String.writeTypedObject + 15;
        o.DERT61String.onMinimized = r3 % 128;
        r3 = r3 % 2;
        r6 = r1.get(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public im.toss.core.tracker.TossReferrerTemplate onWarmupCompleted(@org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.DERT61String.onMinimized
            int r1 = r1 + 33
            int r2 = r1 % 128
            o.DERT61String.writeTypedObject = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            r5.onNavigationEvent()
            java.util.Map<java.lang.String, im.toss.core.tracker.TossReferrerTemplate> r1 = r5.IAuthTabCallback_Parcel
            r3 = 86
            int r3 = r3 / 0
            if (r1 == 0) goto L3d
            goto L2a
        L20:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            r5.onNavigationEvent()
            java.util.Map<java.lang.String, im.toss.core.tracker.TossReferrerTemplate> r1 = r5.IAuthTabCallback_Parcel
            if (r1 == 0) goto L3d
        L2a:
            int r3 = o.DERT61String.writeTypedObject
            int r3 = r3 + 15
            int r4 = r3 % 128
            o.DERT61String.onMinimized = r4
            int r3 = r3 % r0
            java.lang.Object r6 = r1.get(r6)
            im.toss.core.tracker.TossReferrerTemplate r6 = (im.toss.core.tracker.TossReferrerTemplate) r6
            if (r3 == 0) goto L3c
            return r6
        L3c:
            throw r2
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onWarmupCompleted(java.lang.String):im.toss.core.tracker.TossReferrerTemplate");
    }

    public List<Regex> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getInterfaceDescriptor;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, ((java.lang.String) r11[0]).intern()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, ((java.lang.String) r11[0]).intern()) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        r4 = r12.IAuthTabCallbackStubProxy();
        r1 = new java.lang.Object[1];
        b(6 - (android.os.Process.myTid() >> 22), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.graphics.Color.green(0) + 24, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, ((java.lang.String) r1[0]).intern()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        r1 = o.DERT61String.onMinimized + 73;
        o.DERT61String.writeTypedObject = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00eb, code lost:
    
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        r8 = 3 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        return (java.lang.String) r2.get(java.lang.String.valueOf(r12.access000()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
    
        return (java.lang.String) r2.get(java.lang.String.valueOf(r12.access000()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010c, code lost:
    
        r12 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(kotlin.text.StringsKt.split$default(r12.IAuthTabCallback_Parcel(), new java.lang.String[]{o.onInstallReferrerSetupFinished.onWarmupCompleted.onWarmupCompleted()}, false, 0, 6, (java.lang.Object) null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r12 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0132, code lost:
    
        return (java.lang.String) r2.get(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback EVENT;
        private static int IAuthTabCallback;
        public static final onExtraCallback SCREEN;
        private static short[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static byte[] onNavigationEvent;
        private static int onTransact;
        private static int onWarmupCompleted;
        private final String cacheKey;
        private final String hashCacheKey;
        private static final byte[] $$a = {120, 11, 65, 93};
        private static final int $$b = 189;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 1;
        private static int asBinder = 0;
        private static int IAuthTabCallbackStub = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, byte r7, int r8) {
            /*
                int r8 = r8 + 4
                byte[] r0 = o.DERT61String.onExtraCallback.$$a
                int r6 = r6 * 3
                int r1 = 1 - r6
                int r7 = r7 * 4
                int r7 = r7 + 115
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r8 = r8 + 1
                int r4 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r3 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2b:
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DERT61String.onExtraCallback.$$c(byte, byte, int):java.lang.String");
        }

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = asBinder + 53;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {SCREEN, EVENT};
            int i5 = i3 + 39;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
            }
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 63;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 31;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = asBinder + 83;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallbackStub + 105;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = asBinder + 67;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = asBinder + 57;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i, String str2, String str3) {
            this.cacheKey = str2;
            this.hashCacheKey = str3;
        }

        public final String getCacheKey() {
            int i = 2 % 2;
            int i2 = asBinder + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            String str = this.cacheKey;
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            return str;
        }

        public final String getHashCacheKey() {
            int i = 2 % 2;
            int i2 = asBinder + 77;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            String str = this.hashCacheKey;
            if (i3 == 0) {
                int i4 = 23 / 0;
            }
            return str;
        }

        static {
            onTransact = 0;
            onExtraCallback();
            Object[] objArr = new Object[1];
            a((short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49), (byte) (ViewConfiguration.getTapTimeout() >> 16), 11283683 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1389731819 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-23) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((short) ((-16777189) - Color.rgb(0, 0, 0)), (byte) View.MeasureSpec.getSize(0), 11283688 + (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 1389731802, 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a((short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26), (byte) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 11283722, 1389731801 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 10 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
            SCREEN = new onExtraCallback(strIntern, 0, strIntern2, ((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a((short) ((Process.myTid() >> 22) + 81), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Drawable.resolveOpacity(0, 0) + 11283759, Color.rgb(0, 0, 0) + 1406509020, (-23) - View.combineMeasuredStates(0, 0), objArr4);
            String strIntern3 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a((short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 111), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11283763, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1389731802, 5 - KeyEvent.getDeadChar(0, 0), objArr5);
            String strIntern4 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((short) ((-5) - View.MeasureSpec.getMode(0)), (byte) Color.alpha(0), TextUtils.indexOf("", "", 0) + 11283795, 1389731802 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "") + 10, objArr6);
            EVENT = new onExtraCallback(strIntern3, 1, strIntern4, ((String) objArr6[0]).intern());
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = asInterface + 85;
            onTransact = i % 128;
            int i2 = i % 2;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            boolean z2;
            int length;
            byte[] bArr;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSizeAndState(0, 0, 0)), 42 - Color.blue(0), 22439 - (Process.myTid() >> 22), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $10 + 103;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr2 = onNavigationEvent;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        for (int i9 = 0; i9 < length2; i9++) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12842), 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 43424), KeyEvent.getDeadChar(0, 0) + 42, 22439 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i10 = $10;
                    int i11 = i10 + 15;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    if (z) {
                        int i14 = i10 + 93;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), KeyEvent.keyCodeFromString("") + 86, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onNavigationEvent;
                    if (bArr5 != null) {
                        int i16 = $10 + 67;
                        $11 = i16 % 128;
                        if (i16 % 2 == 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                            i5++;
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i17 = $10 + 25;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    int i19 = $11 + 113;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
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

        static void onExtraCallback() {
            onExtraCallbackWithResult = 1528040213;
            onWarmupCompleted = -1538795500;
            IAuthTabCallback = 158185569;
            onNavigationEvent = new byte[]{-48, -57, -54, -42, -73, -26, -43, -30, -57, -9, -46, -44, -30, -46, -8, -2, -17, -49, -11, -43, -32, -38, -2, -26, -19, -48, -4, -35, -47, -29, -15, -41, -39, -9, -22, -30, -17, -21, -45, -16, -41, -57, -2, -25, -42, -29, -40, 8, -45, -43, -29, -45, -7, -1, -32, -64, -10, -42, -31, -37, -1, -25, -18, -47, -3, -34, -46, -28, -14, -24, -38, 8, -21, -29, -32, -20, -67, -80, -106, -56, -110, -127, -98, 115, -93, -114, Byte.MIN_VALUE, -98, -114, -108, -86, -101, 123, -95, -127, -100, 118, -83, -111, -125, -122, -110, 125, -97, -83, -125, 117, -93, -122, -98, -101, -121, -14, 31, -10, -26, 29, 6, -11, 2, -25, 23, -14, -12, 2, -14, 24, 30, 15, -17, 21, -11, 0, -6, 17, 5, -9, 10, 6, -31, 3, 17, -9, -7, 23, 10, 2, 15, 11, 8, 8, 8, 8, 8, 8};
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final /* synthetic */ Object onExtraCallback(DERT61String dERT61String, onExtraCallback onextracallback, access13800 access13800Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -282288960, 282288962, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{dERT61String, onextracallback, access13800Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private final String onWarmupCompleted(Map<String, String> map, downloadZip downloadzip) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (String) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1929884348, -1929884348, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, map, downloadzip}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private final Object onNavigationEvent(onExtraCallback onextracallback, access13800<? super Boolean> access13800Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1746408424, 1746408425, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, onextracallback, access13800Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    static void onExtraCallback() {
        access100 = 8986592149591530247L;
        extraCallback = new char[]{60823, 53107, 43099, 34094, 26121, 17397, 15611, 6619, 64189, 55197, 45413, 37495, 20311, 10281, 1289, 59104, 50163, 48333, 39338, 31379, 21600, 12623, 4675, 60903, 60839, 53073, 43114, 34051, 26153, 17348};
        readTypedObject = -4244311382734876878L;
    }
}
