package im.toss.appsintoss.iap;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp;
import o.LifecyclesKtawaitStarted21;
import o.QueryProductDetailsParamsProduct;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.onPurchasesUpdated;
import o.putChannelInfo;
import o.setPatch;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchasePreparationActivity$asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ InAppPurchasePreparationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchasePreparationActivity$asBinder(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super InAppPurchasePreparationActivity$asBinder> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchasePreparationActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchasePreparationActivity$asBinder inAppPurchasePreparationActivity$asBinder = new InAppPurchasePreparationActivity$asBinder(this.this$0, access13800Var);
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return inAppPurchasePreparationActivity$asBinder;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object objOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 35;
        onNavigationEvent = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 == 0) {
            objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = 53 / 0;
        } else {
            objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        }
        int i5 = onWarmupCompleted + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity$asBinder inAppPurchasePreparationActivity$asBinderCreate = create(findresandmsg, access13800Var);
        if (i4 == 0) {
            inAppPurchasePreparationActivity$asBinderCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = inAppPurchasePreparationActivity$asBinderCreate.invokeSuspend(Unit.INSTANCE);
        int i5 = onWarmupCompleted + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$asBinder$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ onPurchasesUpdated $unconsumedPurchase;
        int label;
        final /* synthetic */ InAppPurchasePreparationActivity this$0;
        private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
        private static final int $$b = 59;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static long onNavigationEvent = 5440234792527211391L;
        private static int onExtraCallback = -1776194565;
        private static char onWarmupCompleted = 27643;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Type inference failed for: r8v2, types: [int] */
        /* JADX WARN: Type inference failed for: r9v1, types: [int] */
        /* JADX WARN: Type inference failed for: r9v6, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, short s3) {
            int i2;
            byte b;
            int i3;
            int i4;
            ?? r8 = (s2 * 2) + 4;
            int i5 = 1 - (s * 3);
            byte[] bArr = $$a;
            ?? r9 = 110 - s3;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                byte b2 = r9;
                i4 = 0;
                byte b3 = r8;
                int i6 = r8;
                ?? r92 = b3 + b2;
                i2 = i4;
                i3 = i6 + 1;
                b = r92;
                byte b4 = b;
                int i7 = i3;
                i4 = i2 + 1;
                bArr2[i2] = b4;
                if (i4 == i5) {
                    return new String(bArr2, 0);
                }
                b2 = bArr[i7];
                b3 = b4;
                i6 = i7;
                ?? r922 = b3 + b2;
                i2 = i4;
                i3 = i6 + 1;
                b = r922;
                byte b42 = b;
                int i72 = i3;
                i4 = i2 + 1;
                bArr2[i2] = b42;
                if (i4 == i5) {
                }
            } else {
                i2 = 0;
                i3 = r8;
                b = r9;
                byte b422 = b;
                int i722 = i3;
                i4 = i2 + 1;
                bArr2[i2] = b422;
                if (i4 == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(onPurchasesUpdated onpurchasesupdated, InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
            this.$unconsumedPurchase = onpurchasesupdated;
            this.this$0 = inAppPurchasePreparationActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$unconsumedPurchase, this.this$0, access13800Var);
            int i3 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = 45 / 0;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            char c2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i4 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i2));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i5 = $11 + 3;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42;
                        int trimmedLength = 1451 - TextUtils.getTrimmedLength("");
                        byte b = (byte) i4;
                        byte b2 = b;
                        String str$$c = $$c(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild, i7, trimmedLength, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cArgb = (char) (Color.argb(i4, i4, i4, i4) + 49123);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4, i4) + 45;
                        int keyRepeatTimeout = 1494 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b3 = (byte) i4;
                        byte b4 = b3;
                        String str$$c2 = $$c(b3, b4, (byte) (b4 + 1));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, iLastIndexOf, keyRepeatTimeout, 1533236389, false, str$$c2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i8 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i8);
                    objArr4[i4] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 23973);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 50;
                        int i9 = (ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 22940;
                        c2 = 3;
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i4] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionChild2, pressedStateDuration, i9, 1872485556, false, "k", clsArr3);
                    } else {
                        c2 = 3;
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i10 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i4] = Integer.valueOf(i10);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 45848);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 29;
                        int doubleTapTimeout = 12577 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i4] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, jumpTapTimeout, doubleTapTimeout, 1401536470, false, "l", clsArr4);
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallback ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i11 = $10 + 59;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i12 = 8 / 0;
                objArr[0] = str;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x00c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strIntern;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 71;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 105;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String strIAuthTabCallback = this.$unconsumedPurchase.IAuthTabCallback();
            String strOnTransact = ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this.this$0}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onTransact();
            boolean zBooleanValue = ((Boolean) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{(InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this.this$0}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)}, -1337948934, 1337948941)).booleanValue();
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder = ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this.this$0}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).asBinder();
            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder != null) {
                int i8 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                strIntern = safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder.onExtraCallback();
                if (strIntern == null) {
                    Object[] objArr = new Object[1];
                    a((char) (View.resolveSizeAndState(0, 0, 0) + 57960), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{6811, 30305, 6816, 2790}, new char[]{16516, 51567, 38030, 10053}, new char[]{52688, 36379, 26797, 25058}, objArr);
                    strIntern = ((String) objArr[0]).intern();
                }
            }
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "apps-in-toss-iap", "recovery-candidate product=" + strIAuthTabCallback + " orderId=" + strOnTransact + " canRecover=" + zBooleanValue + " blockedByError=" + strIntern, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            if (!((Boolean) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{(InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this.this$0}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)}, -1337948934, 1337948941)).booleanValue()) {
                return Unit.INSTANCE;
            }
            InAppPurchasePreparationActivity.onNavigationEvent(this.this$0, this.$unconsumedPurchase.IAuthTabCallback(), this.$unconsumedPurchase.onWarmupCompleted());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r5, r6, r13) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i2;
        boolean zBooleanValue;
        onPurchasesUpdated onpurchasesupdated;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = this.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
            this.label = 1;
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            obj = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "appsintoss.iap.orderpage.checkwhenresume", boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
            if (obj != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        int i7 = onNavigationEvent + 87;
        int i8 = i7 % 128;
        onWarmupCompleted = i8;
        if (i7 % 2 == 0 ? i6 == 1 : i6 == 1) {
            ResultKt.onNavigationEvent(obj);
        } else {
            if (i6 != 2) {
                int i9 = i8 + 59;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                if (i6 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Unit unit = Unit.INSTANCE;
                i2 = onWarmupCompleted + 91;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            zBooleanValue = this.Z$0;
            ResultKt.onNavigationEvent(obj);
            onpurchasesupdated = (onPurchasesUpdated) obj;
            if (onpurchasesupdated != null) {
                setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(onpurchasesupdated, this.this$0, null);
                this.L$0 = access15400.onNavigationEvent(onpurchasesupdated);
                this.Z$0 = zBooleanValue;
                this.label = 3;
            }
            Unit unit2 = Unit.INSTANCE;
            i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
            }
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            int i11 = onNavigationEvent + 99;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return Unit.INSTANCE;
        }
        QueryProductDetailsParamsProduct queryProductDetailsParamsProductIAuthTabCallbackStub = InAppPurchasePreparationActivity.IAuthTabCallbackStub(this.this$0);
        Object[] objArr = {this.this$0};
        String typedObject = ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).readTypedObject();
        this.Z$0 = zBooleanValue;
        this.label = 2;
        obj = queryProductDetailsParamsProductIAuthTabCallbackStub.onExtraCallbackWithResult(typedObject, this);
        if (obj != objOnWarmupCompleted) {
            onpurchasesupdated = (onPurchasesUpdated) obj;
            if (onpurchasesupdated != null) {
            }
            Unit unit22 = Unit.INSTANCE;
            i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
            }
        }
        return objOnWarmupCompleted;
    }
}
