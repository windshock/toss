package viva.republica.toss.guest.certify.verify;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.base.BaseFragment;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AUPop;
import o.AUSegment5;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.createPaints;
import o.enableVirtualViewRenderState;
import o.findResAndMsg;
import o.getIconfontFileName;
import o.getParamImp;
import o.getPhotoHeight;
import o.initMiniApp;
import o.isImageLoaded;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class SmsVerificationFragment$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ Function1<SetDetectableSize, Unit> $addDefaultLogParams;
    final /* synthetic */ boolean $increaseServerRetryCount;
    final /* synthetic */ Function1<Boolean, Unit> $onResult;
    int label;
    final /* synthetic */ SmsVerificationFragment this$0;
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallback = {60832, 64633, 52776, 55540, 43681, 7732, 4081, 15787, 11135, 22834, 18157, 29880, 25208, 36889, 33243, 44950};
    private static long onNavigationEvent = 3142589071526198288L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4;
        int i5 = 4 - (i * 3);
        byte[] bArr = $$a;
        int i6 = 1 - (b * 4);
        int i7 = 97 - (i2 * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i7 += -i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            i7 += -i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SmsVerificationFragment$onExtraCallbackWithResult(SmsVerificationFragment smsVerificationFragment, Function1<? super Boolean, Unit> function1, boolean z, Function1<? super SetDetectableSize, Unit> function12, access13800<? super SmsVerificationFragment$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.this$0 = smsVerificationFragment;
        this.$onResult = function1;
        this.$increaseServerRetryCount = z;
        this.$addDefaultLogParams = function12;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = ~(i7 | i2);
        int i10 = i8 | i9;
        int i11 = ~i4;
        int i12 = (~((~i2) | i7 | i4)) | (~(i7 | i11 | i2));
        int i13 = i9 | (~(i11 | i6));
        int i14 = i6 + i4 + i3 + ((-1696018712) * i5) + (2108813197 * i);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i6) - 2121662464) + (1221732374 * i4) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i3) + (39845888 * i5) + (227278848 * i) + ((-1705377792) * i15);
        int i17 = ((i6 * 362004572) - 1408384217) + (i4 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i3 * 362004373) + (i5 * (-1290304248)) + (i * 155295761) + (i15 * (-60686336));
        return i16 + ((i17 * i17) * (-1680474112)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = onWarmupCompleted + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th, SmsVerificationFragment smsVerificationFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th, smsVerificationFragment, dialogInterface);
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Throwable th = (Throwable) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(th, function1, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(th, function1, setDetectableSize);
        int i3 = IAuthTabCallback + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th, Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, new Object[]{th, function1, setDetectableSize}, iOnNavigationEvent2, 1849773305, iOnNavigationEvent3, -1849773304);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(th, function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(th, function1);
        int i3 = IAuthTabCallback + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        SmsVerificationFragment$onExtraCallbackWithResult smsVerificationFragment$onExtraCallbackWithResult = new SmsVerificationFragment$onExtraCallbackWithResult(this.this$0, this.$onResult, this.$increaseServerRetryCount, this.$addDefaultLogParams, access13800Var);
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return smsVerificationFragment$onExtraCallbackWithResult;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800<? super Unit>) obj2);
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 23;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 10973 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 46134), 31 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 20219 - ((byte) KeyEvent.getModifierMetaStateMask()), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49122);
                    int iIndexOf = 43 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                    int iAlpha = Color.alpha(0) + 1494;
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iIndexOf, iAlpha, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 43;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        char offsetBefore = (char) (49123 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                        int absoluteGravity = 1494 - Gravity.getAbsoluteGravity(0, 0);
                        byte b3 = (byte) ($$a[0] - 1);
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, doubleTapTimeout, absoluteGravity, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i8 = 9 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    char packedPositionGroup = (char) (49123 - ExpandableListView.getPackedPositionGroup(0L));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 44;
                    int iResolveSize = View.resolveSize(0, 0) + 1494;
                    byte b5 = (byte) ($$a[0] - 1);
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, iResolveOpacity, iResolveSize, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i9 = $11 + 123;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* renamed from: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onExtraCallbackWithResult$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<access13800<? super Result<? extends Long>>, Object> {
        final /* synthetic */ boolean $increaseServerRetryCount;
        Object L$0;
        int label;
        final /* synthetic */ SmsVerificationFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, SmsVerificationFragment smsVerificationFragment, access13800<? super AnonymousClass1> access13800Var) {
            super(1, access13800Var);
            this.$increaseServerRetryCount = z;
            this.this$0 = smsVerificationFragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Result<Long>> access13800Var) {
            return create(access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new AnonymousClass1(this.$increaseServerRetryCount, this.this$0, access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallbackWithResult;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                if (this.$increaseServerRetryCount) {
                    long jAccess100 = SmsVerificationFragment.asInterface(this.this$0).access100();
                    createPaints createpaints = createPaints.IAuthTabCallback;
                    AUPop aUPopOnNavigationEvent = isImageLoaded.onNavigationEvent("TS-USI", jAccess100, enableVirtualViewRenderState.onNavigationEvent(createpaints.onExtraCallback()), createpaints, CollectionsKt.listOf(new String[]{"5", "6", "7", "8"}).contains(createpaints.onTransact()));
                    getIconfontFileName geticonfontfilenameIAuthTabCallbackDefault = SmsVerificationFragment.IAuthTabCallbackDefault(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(aUPopOnNavigationEvent);
                    this.label = 1;
                    objOnExtraCallbackWithResult = geticonfontfilenameIAuthTabCallbackDefault.IAuthTabCallback(aUPopOnNavigationEvent, this);
                } else {
                    getIconfontFileName geticonfontfilenameIAuthTabCallbackDefault2 = SmsVerificationFragment.IAuthTabCallbackDefault(this.this$0);
                    Object[] objArr = {this.this$0};
                    long jLongValue = ((Long) SmsVerificationFragment.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1195925855, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1195925852)).longValue();
                    this.label = 2;
                    objOnExtraCallbackWithResult = geticonfontfilenameIAuthTabCallbackDefault2.onExtraCallbackWithResult(jLongValue, this);
                }
            }
            return Result.IAuthTabCallback(objOnExtraCallbackWithResult);
        }
    }

    private static final Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.FALSE);
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        int i4 = 4 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Throwable th, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TossApiCallException.ApiError apiError = (TossApiCallException.ApiError) th;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getDoubleTapTimeout() >> 16, 4 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), (char) View.resolveSizeAndState(0, 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), apiError.onTransact());
        Object[] objArr2 = new Object[1];
        a(5 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 62340), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), apiError.getLocalizedMessage());
        setDetectableSize.onExtraCallback("err_code", apiError.asBinder());
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        TossApiCallException.ApiError apiError = (Throwable) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TossApiCallException.ApiError apiError2 = apiError;
        Object[] objArr2 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, ExpandableListView.getPackedPositionType(0L) + 5, (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), apiError2.onTransact());
        Object[] objArr3 = new Object[1];
        a(4 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 11, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62340), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), apiError2.getLocalizedMessage());
        setDetectableSize.onExtraCallback("err_code", apiError2.asBinder());
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(final Throwable th, final Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (th instanceof TossApiCallException.ApiError) {
            ConvertByteArrayToFloatArray.onExtraCallback(1232107L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onRetrySms$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return SmsVerificationFragment$onExtraCallbackWithResult.onExtraCallbackWithResult(th, function1, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Throwable th, SmsVerificationFragment smsVerificationFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (th instanceof TossApiCallException.ApiError) {
            int i5 = i3 + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 63 / 0;
                if (Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), "TV3001")) {
                    FragmentActivity activity = smsVerificationFragment.getActivity();
                    if (activity != null) {
                        activity.finishAffinity();
                        int i7 = onWarmupCompleted + 63;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            } else if (Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), "TV3001")) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r20.asBinder(), "TV3212") != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted;
        final TossApiCallException.ApiError apiError;
        long j;
        int i = 2 % 2;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i2 = this.label;
        boolean z = true;
        Object obj2 = null;
        if (i2 != 0) {
            int i3 = onWarmupCompleted + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objOnWarmupCompleted = obj;
        } else {
            ResultKt.onNavigationEvent(obj);
            BaseFragment.showProgressDialog$default(this.this$0, (String) null, false, 3, (Object) null);
            SmsVerificationFragment smsVerificationFragment = this.this$0;
            final Function1<Boolean, Unit> function1 = this.$onResult;
            Function0 function0 = new Function0() { // from class: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onRetrySms$1$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return SmsVerificationFragment$onExtraCallbackWithResult.IAuthTabCallback(function1);
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$increaseServerRetryCount, this.this$0, null);
            this.label = 1;
            objOnWarmupCompleted = SmsVerificationFragment.onWarmupCompleted(smsVerificationFragment, function0, anonymousClass1, this);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
        }
        Result result = (Result) objOnWarmupCompleted;
        if (result != null) {
            Object objOnNavigationEvent = result.onNavigationEvent();
            SmsVerificationFragment smsVerificationFragment2 = this.this$0;
            Function1<Boolean, Unit> function12 = this.$onResult;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                SmsVerificationFragment.onExtraCallback(smsVerificationFragment2, ((Number) objOnNavigationEvent).longValue());
                function12.invoke(access14000.onNavigationEvent(true));
                AUSegment5 aUSegment5ExtraCallback = smsVerificationFragment2.extraCallback();
                if (aUSegment5ExtraCallback != null) {
                    aUSegment5ExtraCallback.IAuthTabCallback();
                }
            }
            Function1<Boolean, Unit> function13 = this.$onResult;
            final SmsVerificationFragment smsVerificationFragment3 = this.this$0;
            final Function1<SetDetectableSize, Unit> function14 = this.$addDefaultLogParams;
            TossApiCallException.ApiError cause = Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (cause != null) {
                int i4 = IAuthTabCallback + 67;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    function13.invoke(access14000.onNavigationEvent(true));
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("SmsVerificationActivity", cause);
                    if (cause instanceof getPhotoHeight) {
                        cause = ((getPhotoHeight) cause).getCause();
                        int i5 = onWarmupCompleted + 57;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    apiError = cause;
                    if (apiError instanceof TossApiCallException.ApiError) {
                        ConvertByteArrayToFloatArray.onExtraCallback(1232103L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onRetrySms$1$$ExternalSyntheticLambda2
                            public final Object invoke(Object obj3) {
                                Object[] objArr = {apiError, function14, (SetDetectableSize) obj3};
                                return (Unit) SmsVerificationFragment$onExtraCallbackWithResult.IAuthTabCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1511049263, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1511049263);
                            }
                        }, 14, (Object) null);
                        TossApiCallException.ApiError apiError2 = apiError;
                        if (!Intrinsics.areEqual(apiError2.asBinder(), "TV3211")) {
                            int i7 = IAuthTabCallback + 43;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        if (!((Boolean) CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{SmsVerificationFragment.asInterface(smsVerificationFragment3)}, -1033083291, 1033083313, ICustomTabsCallbackStubProxy.onExtraCallback())).booleanValue() || SmsVerificationFragment.IAuthTabCallback_Parcel(smsVerificationFragment3)) {
                            z = false;
                        } else {
                            int i9 = onWarmupCompleted + 67;
                            IAuthTabCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                            }
                        }
                        long j2 = z ? 1262663L : 1232103L;
                        if (z) {
                            int i10 = IAuthTabCallback + 15;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 == 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            j = 1262665;
                        } else {
                            j = 1232107;
                        }
                        long j3 = j;
                        AUSegment5 aUSegment5ExtraCallback2 = smsVerificationFragment3.extraCallback();
                        if (aUSegment5ExtraCallback2 != null) {
                            int i11 = IAuthTabCallback + 119;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            aUSegment5ExtraCallback2.onWarmupCompleted(apiError2, j2, j3);
                        }
                        return Unit.INSTANCE;
                    }
                    getParamImp.onWarmupCompleted(apiError, smsVerificationFragment3.requireContext(), false, (initMiniApp) null, new Function0() { // from class: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onRetrySms$1$$ExternalSyntheticLambda3
                        public final Object invoke() {
                            return SmsVerificationFragment$onExtraCallbackWithResult.onNavigationEvent(apiError, function14);
                        }
                    }, new Function1() { // from class: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onRetrySms$1$$ExternalSyntheticLambda4
                        public final Object invoke(Object obj3) {
                            return SmsVerificationFragment$onExtraCallbackWithResult.onExtraCallback(apiError, smsVerificationFragment3, (DialogInterface) obj3);
                        }
                    }, 6, (Object) null);
                } else {
                    function13.invoke(access14000.onNavigationEvent(false));
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("SmsVerificationActivity", cause);
                    if (cause instanceof getPhotoHeight) {
                    }
                    apiError = cause;
                    if (apiError instanceof TossApiCallException.ApiError) {
                    }
                    getParamImp.onWarmupCompleted(apiError, smsVerificationFragment3.requireContext(), false, (initMiniApp) null, new Function0() { // from class: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onRetrySms$1$$ExternalSyntheticLambda3
                        public final Object invoke() {
                            return SmsVerificationFragment$onExtraCallbackWithResult.onNavigationEvent(apiError, function14);
                        }
                    }, new Function1() { // from class: viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onRetrySms$1$$ExternalSyntheticLambda4
                        public final Object invoke(Object obj3) {
                            return SmsVerificationFragment$onExtraCallbackWithResult.onExtraCallback(apiError, smsVerificationFragment3, (DialogInterface) obj3);
                        }
                    }, 6, (Object) null);
                }
            }
            Result.IAuthTabCallback(objOnNavigationEvent);
        }
        this.this$0.dismissProgressDialog();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th, Function1 function1, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Unit) IAuthTabCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, new Object[]{th, function1, setDetectableSize}, iOnNavigationEvent2, 1511049263, iOnNavigationEvent3, -1511049263);
    }

    private static final Unit onExtraCallback(Throwable th, Function1 function1, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Unit) IAuthTabCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, new Object[]{th, function1, setDetectableSize}, iOnNavigationEvent2, 1849773305, iOnNavigationEvent3, -1849773304);
    }
}
