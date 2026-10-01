package im.toss.features.home.ui.view.alarm;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import im.toss.features.home.ui.R;
import im.toss.features.home.ui.view.alarm.HomeMydataNotiOnBottomSheet$;
import im.toss.features.home.ui.view.alarm.HomeMydataNotiOnBottomSheet$notiBottomSheetClickLog$1$;
import im.toss.features.home.ui.view.alarm.HomeMydataNotiOnBottomSheet$notiBottomSheetScreenLog$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.ServerSideApiContext;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.findRes;
import o.findResAndMsg;
import o.getPackageType;
import o.isNeedUnzip;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.trackCheckout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeMydataNotiOnBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI implements findResAndMsg {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private final ServerSideApiContext IAuthTabCallback;
    private final CoroutineContext onExtraCallback;
    private static char[] onExtraCallbackWithResult = {32740, 32528, 32540, 32529, 32714, 32733, 32739, 32539, 32737, 32734, 32541, 32543, 32542, 32741, 32720, 32532, 32735, 32743, 32536, 32530};
    private static int onNavigationEvent = -1184333940;
    private static boolean asBinder = true;
    private static boolean asInterface = true;

    public static /* synthetic */ Unit IAuthTabCallback(HomeMydataNotiOnBottomSheet homeMydataNotiOnBottomSheet, String str, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(homeMydataNotiOnBottomSheet, str, tdsBottomCtaV1View, view);
        }
        onNavigationEvent(homeMydataNotiOnBottomSheet, str, tdsBottomCtaV1View, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeMydataNotiOnBottomSheet(@NotNull Context context, @NotNull ServerSideApiContext serverSideApiContext) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(serverSideApiContext, "");
        this.IAuthTabCallback = serverSideApiContext;
        this.onExtraCallback = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback());
    }

    public static final /* synthetic */ ServerSideApiContext onNavigationEvent(HomeMydataNotiOnBottomSheet homeMydataNotiOnBottomSheet) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        ServerSideApiContext serverSideApiContext = homeMydataNotiOnBottomSheet.IAuthTabCallback;
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        int i6 = i3 + 45;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return serverSideApiContext;
    }

    public CoroutineContext getCoroutineContext() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 47;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CoroutineContext coroutineContext = this.onExtraCallback;
        int i4 = i2 + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(tdsTopV1View.getContext().getString(R.string.home_ui_mydata_noti_on_bottom_sheet_title));
        tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
        tdsTopV1View.setLowerText(tdsTopV1View.getContext().getString(R.string.home_ui_mydata_noti_on_bottom_sheet_description));
        tdsTopV1View.setLowerTextColor(ContextCompat.getColor(tdsTopV1View.getContext(), im.toss.tds.R.color.grey_800));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTopV1View);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-114, -115, -125, -118, -116, -108, -121, -109, -121, -111, -110, -115, -117, -127, -125, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, TextUtils.lastIndexOf("", '0', 0) + 128, objArr);
        tdsListRowV1View.setLeftImage(((String) objArr[0]).intern());
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View.setCenterText1(tdsListRowV1View.getContext().getString(R.string.home_ui_notification));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        View viewFindViewById = tdsBottomCtaV1View.findViewById(im.toss.tds.view.R.id.gradient);
        if (viewFindViewById != null) {
            int i2 = IAuthTabCallbackDefault + 93;
            onTransact = i2 % 128;
            viewFindViewById.setVisibility(i2 % 2 != 0 ? 110 : 8);
            int i3 = onTransact + 51;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
        String string = tdsBottomCtaV1View.getContext().getString(R.string.home_ui_turn_on_now);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new HomeMydataNotiOnBottomSheet$.ExternalSyntheticLambda0(this, string, tdsBottomCtaV1View), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        setContentView(linearLayout);
    }

    private static final Unit onNavigationEvent(HomeMydataNotiOnBottomSheet homeMydataNotiOnBottomSheet, String str, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            homeMydataNotiOnBottomSheet.onExtraCallback(str);
            homeMydataNotiOnBottomSheet.dismiss();
            trackCheckout trackcheckoutOnNavigationEvent = trackCheckout.Companion.onNavigationEvent();
            Context context = tdsBottomCtaV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            trackcheckoutOnNavigationEvent.asBinder(context);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        homeMydataNotiOnBottomSheet.onExtraCallback(str);
        homeMydataNotiOnBottomSheet.dismiss();
        trackCheckout trackcheckoutOnNavigationEvent2 = trackCheckout.Companion.onNavigationEvent();
        Context context2 = tdsBottomCtaV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        trackcheckoutOnNavigationEvent2.asBinder(context2);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public void show() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.show();
            onExtraCallbackWithResult();
            int i3 = 40 / 0;
        } else {
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.show();
            onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallbackDefault + 113;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void dismiss() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(this, "");
        findRes.onExtraCallbackWithResult(this, (CancellationException) null, 1, (Object) null);
        super/*o.getTypedExportedConstants*/.dismiss();
        int i4 = IAuthTabCallbackDefault + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;
        private static final byte[] $$a = {57, 22, -21, -92};
        private static final int $$b = 65;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onExtraCallback = 7798559133331975163L;
        private static int onWarmupCompleted = -1776194565;
        private static char onExtraCallbackWithResult = 12391;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, int i2) {
            int i3;
            int i4 = i + 4;
            byte[] bArr = $$a;
            int i5 = 110 - i2;
            int i6 = s * 2;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            if (bArr == null) {
                int i8 = i5;
                int i9 = 0;
                int i10 = i4;
                int i11 = i4 + i8;
                i3 = i9;
                int i12 = i10;
                i5 = i11;
                i4 = i12;
                bArr2[i3] = (byte) i5;
                i9 = i3 + 1;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                int i13 = i4 + 1;
                int i14 = i5;
                i10 = i13;
                i4 = bArr[i13];
                i8 = i14;
                int i112 = i4 + i8;
                i3 = i9;
                int i122 = i10;
                i5 = i112;
                i4 = i122;
                bArr2[i3] = (byte) i5;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i5;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            }
        }

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onWarmupCompleted(HomeMydataNotiOnBottomSheet homeMydataNotiOnBottomSheet, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(homeMydataNotiOnBottomSheet, setDetectableSize);
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = HomeMydataNotiOnBottomSheet.this.new onExtraCallback(access13800Var);
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = 50 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 59 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[PHI: r12
          0x003e: PHI (r12v6 int) = (r12v5 int), (r12v13 int) binds: [B:10:0x003c, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i;
            long j;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 51;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 73;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i7 == 0) {
                i = onExtraCallbackWithResult.onNavigationEvent[HomeMydataNotiOnBottomSheet.onNavigationEvent(HomeMydataNotiOnBottomSheet.this).ordinal()];
                if (i == 1) {
                    j = 1220613;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = 1220615;
                }
            } else {
                i = onExtraCallbackWithResult.onNavigationEvent[HomeMydataNotiOnBottomSheet.onNavigationEvent(HomeMydataNotiOnBottomSheet.this).ordinal()];
                if (i != 1) {
                }
            }
            ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new HomeMydataNotiOnBottomSheet$notiBottomSheetScreenLog$1$.ExternalSyntheticLambda0(HomeMydataNotiOnBottomSheet.this), 14, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i8 = IAuthTabCallback + 71;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 37 / 0;
            }
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit IAuthTabCallback(HomeMydataNotiOnBottomSheet homeMydataNotiOnBottomSheet, SetDetectableSize setDetectableSize) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 110) + 5127), (-247454223) - Color.red(1), new char[]{45824, 15308, 12072, 19725, 16949}, new char[]{0, 0, 0, 0}, new char[]{61786, 16421, 27121, 36627}, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4969), (-247454223) - Color.red(0), new char[]{45824, 15308, 12072, 19725, 16949}, new char[]{0, 0, 0, 0}, new char[]{61786, 16421, 27121, 36627}, objArr2);
                obj = objArr2[0];
            }
            setDetectableSize.onExtraCallback(((String) obj).intern(), homeMydataNotiOnBottomSheet.getContext().getString(R.string.home_ui_mydata_noti_on_bottom_sheet_title));
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i3 = $11 + 67;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionType(0L) + 43, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122), Gravity.getAbsoluteGravity(0, 0) + 44, 1494 - ((Process.getThreadPriority(0) + 20) >> 6), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 23972), 50 - Color.blue(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 45848), Color.green(0) + 29, View.combineMeasuredStates(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
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
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            String str = new String(cArr6);
            int i5 = $10 + 43;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            objArr[0] = str;
        }
    }

    private final getPackageType onExtraCallbackWithResult() {
        int i = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(this, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onExtraCallback(null), 2, (Object) null);
        int i2 = onTransact + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return getpackagetypeOnNavigationEvent;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $buttonTitle;
        int label;
        private static final byte[] $$a = {11, -55, -20, -91};
        private static final int $$b = 18;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private static int onExtraCallbackWithResult = 478308866;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i, short s) {
            int i2;
            int i3;
            byte[] bArr = $$a;
            int i4 = (s * 2) + 105;
            int i5 = b + 4;
            int i6 = 1 - (i * 4);
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i5;
                int i8 = i6;
                i3 = 0;
                int i9 = i5 + i8;
                i2 = i3;
                int i10 = i7;
                i4 = i9;
                i5 = i10;
                int i11 = i5 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                    return new String(bArr2, 0);
                }
                i8 = bArr[i11];
                int i12 = i4;
                i7 = i11;
                i5 = i12;
                int i92 = i5 + i8;
                i2 = i3;
                int i102 = i7;
                i4 = i92;
                i5 = i102;
                int i112 = i5 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                int i1122 = i5 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$buttonTitle = str;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(HomeMydataNotiOnBottomSheet homeMydataNotiOnBottomSheet, String str, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(homeMydataNotiOnBottomSheet, str, setDetectableSize);
            }
            onWarmupCompleted(homeMydataNotiOnBottomSheet, str, setDetectableSize);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = HomeMydataNotiOnBottomSheet.this.new onWarmupCompleted(this.$buttonTitle, access13800Var);
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 31;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r11
          0x0037: PHI (r11v6 int) = (r11v5 int), (r11v14 int) binds: [B:10:0x0035, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i;
            long j;
            int i2 = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = onWarmupCompleted + 57;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i4 != 0) {
                i = onExtraCallback.onExtraCallback[HomeMydataNotiOnBottomSheet.onNavigationEvent(HomeMydataNotiOnBottomSheet.this).ordinal()];
                if (i != 0) {
                    int i5 = onWarmupCompleted;
                    int i6 = i5 + 71;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0 ? i != 2 : i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i7 = i5 + 67;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    j = 1220625;
                } else {
                    j = 1220623;
                }
            } else {
                i = onExtraCallback.onExtraCallback[HomeMydataNotiOnBottomSheet.onNavigationEvent(HomeMydataNotiOnBottomSheet.this).ordinal()];
                if (i != 1) {
                }
            }
            ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new HomeMydataNotiOnBottomSheet$notiBottomSheetClickLog$1$.ExternalSyntheticLambda0(HomeMydataNotiOnBottomSheet.this, this.$buttonTitle), 14, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onWarmupCompleted(HomeMydataNotiOnBottomSheet homeMydataNotiOnBottomSheet, String str, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(5 - View.MeasureSpec.getMode(0), 3 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{65535, 65528, 7, 65532, 7}, false, 152 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), homeMydataNotiOnBottomSheet.getContext().getString(R.string.home_ui_mydata_noti_on_bottom_sheet_title));
            Object[] objArr2 = new Object[1];
            a(12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 5 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{65522, 7, 65532, 7, 65535, 65528, 65525, '\b', 7, 7, 2, 1}, false, TextUtils.lastIndexOf("", '0', 0) + 153, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
            setDetectableSize.onExtraCallback("redirect_to", "SETTING");
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01ca  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            float f;
            Throwable cause;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                f = 0.0f;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 35125), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, 10279 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getCapsMode("", 0, 0)), TextUtils.getCapsMode("", 0, 0) + 55, 2167 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                int i6 = $11 + 21;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i8 = $11 + 113;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    int i10 = $10 + 93;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i >> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) << 1];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 12843), 55 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback4 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 56 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    f = 0.0f;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    private final getPackageType onExtraCallback(String str) {
        int i = 2 % 2;
        Object obj = null;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(this, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onWarmupCompleted(str, null), 2, (Object) null);
        int i2 = IAuthTabCallbackDefault + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return getpackagetypeOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallbackWithResult;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 77 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 20951 - Process.getGidForName(""), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 125;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 74 - ImageFormat.getBitsPerPixel(0), 16037 - (ViewConfiguration.getPressedStateDuration() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 39;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    int i8 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                    cArr5[i7] = (char) (cArr3[bArr[0 - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] + iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 64, TextUtils.indexOf("", "", 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 63 - View.getDefaultSize(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            String str = new String(cArr5);
            int i9 = $11 + 29;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i11 = $11 + 1;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), View.MeasureSpec.getSize(0) + 63, 12215 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }
}
