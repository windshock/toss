package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import o.GeckoHubImp;
import o.LifecyclesKtawaitStarted21;
import o.addAnimatorPauseListener;
import o.addLottieOnCompositionLoadedListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LifecyclesKtawaitStarted21 {
    public static final LifecyclesKtawaitStarted21 IAuthTabCallback;
    private static final Lazy IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static short[] access100;
    private static int asBinder;
    private static byte[] asInterface;
    private static final Lazy onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static final Lazy onNavigationEvent;
    private static int onTransact;
    private static final jni_YGNodeStyleGetFlexBasisJNI onWarmupCompleted;
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 0;
    private static int access000 = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LifecyclesKtawaitStarted21.this.onNavigationEvent(false, (access13800<? super Unit>) this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{LifecyclesKtawaitStarted21.this, 0L, null, null, this}, 845648892, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -845648891, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            int i4 = onNavigationEvent + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (i2 * 4);
        int i5 = (i * 3) + 115;
        int i6 = b * 3;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4++;
            i5 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i4++;
            i5 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ setCompositionTask IAuthTabCallback() {
        setCompositionTask setcompositiontaskIAuthTabCallbackStubProxy;
        int i = 2 % 2;
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            setcompositiontaskIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            int i3 = 88 / 0;
        } else {
            setcompositiontaskIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        }
        int i4 = access000 + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return setcompositiontaskIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i5)) | (~(i | i5));
        int i9 = i | i6;
        int i10 = (~(i6 | (~i5))) | (~(i7 | (~i))) | (~i9);
        int i11 = i + i5 + i3 + (1350191703 * i4) + ((-44904237) * i2);
        int i12 = i11 * i11;
        int i13 = ((i * (-560584373)) - 948043776) + ((-560584373) * i5) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i3) + ((-71041024) * i4) + ((-766246912) * i2) + (1339949056 * i12);
        int i14 = (i * 1657715387) + 2046152777 + (i5 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i3 * 1657716305) + (i4 * 1507858311) + (i2 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 != 2) {
            return i15 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = (LifecyclesKtawaitStarted21) objArr[0];
        int i16 = 2 % 2;
        int i17 = getInterfaceDescriptor + 41;
        access000 = i17 % 128;
        int i18 = i17 % 2;
        addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistenerOnTransact = lifecyclesKtawaitStarted21.onTransact();
        int i19 = access000 + 11;
        getInterfaceDescriptor = i19 % 128;
        int i20 = i19 % 2;
        return addlottieoncompositionloadedlistenerOnTransact;
    }

    public static /* synthetic */ addLottieOnCompositionLoadedListener onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistenerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = access000 + 85;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return addlottieoncompositionloadedlistenerIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ addAnimatorPauseListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        addAnimatorPauseListener addanimatorpauselistenerAsInterface = asInterface();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return addanimatorpauselistenerAsInterface;
    }

    private LifecyclesKtawaitStarted21() {
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = (LifecyclesKtawaitStarted21) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        trimMetadataStringsTo trimmetadatastringsto = (trimMetadataStringsTo) objArr[2];
        Pair<String, ? extends Object>[] pairArr = (Pair[]) objArr[3];
        access13800<? super Map<String, String>> access13800Var = (access13800) objArr[4];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = lifecyclesKtawaitStarted21.IAuthTabCallback(jLongValue, trimmetadatastringsto, pairArr, access13800Var);
        int i4 = access000 + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return objIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setCompositionTask onExtraCallbackWithResult(LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        setCompositionTask setcompositiontaskIAuthTabCallbackDefault = lifecyclesKtawaitStarted21.IAuthTabCallbackDefault();
        int i4 = getInterfaceDescriptor + 29;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return setcompositiontaskIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ addAnimatorPauseListener onNavigationEvent(LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21) {
        int i = 2 % 2;
        int i2 = access000 + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        addAnimatorPauseListener addanimatorpauselistenerAsBinder = lifecyclesKtawaitStarted21.asBinder();
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return addanimatorpauselistenerAsBinder;
    }

    public static final /* synthetic */ Object onWarmupCompleted(LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21, String str, String str2, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = lifecyclesKtawaitStarted21.onWarmupCompleted(str, str2, obj);
        int i4 = access000 + 83;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 97;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        boolean z = onExtraCallbackWithResult;
        int i5 = i2 + 85;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackStubProxy = 1;
        onExtraCallback();
        IAuthTabCallback = new LifecyclesKtawaitStarted21();
        IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.VarsV2$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return LifecyclesKtawaitStarted21.IAuthTabCallback();
                }
                LifecyclesKtawaitStarted21.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.VarsV2$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistenerOnExtraCallbackWithResult = LifecyclesKtawaitStarted21.onExtraCallbackWithResult();
                int i4 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return addlottieoncompositionloadedlistenerOnExtraCallbackWithResult;
            }
        });
        onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.variable.v2.VarsV2$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                addAnimatorPauseListener addanimatorpauselistenerOnNavigationEvent = LifecyclesKtawaitStarted21.onNavigationEvent();
                int i4 = onExtraCallback + 89;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return addanimatorpauselistenerOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        onWarmupCompleted = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
        int i = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    private final setCompositionTask IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setCompositionTask setcompositiontask = (setCompositionTask) IAuthTabCallbackDefault.getValue();
        int i4 = access000 + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return setcompositiontask;
    }

    private static final setCompositionTask IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access000 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        setCompositionTask setcompositiontaskOnActivityLayout = ((ServiceLoaderComponentRegistryExternalSyntheticLambda1) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ServiceLoaderComponentRegistryExternalSyntheticLambda1.class)).onActivityLayout();
        int i4 = getInterfaceDescriptor + 53;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return setcompositiontaskOnActivityLayout;
        }
        throw null;
    }

    private final addLottieOnCompositionLoadedListener onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 43;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistener = (addLottieOnCompositionLoadedListener) onExtraCallback.getValue();
        int i3 = getInterfaceDescriptor + 29;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return addlottieoncompositionloadedlistener;
        }
        throw null;
    }

    private static final addLottieOnCompositionLoadedListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            addLottieOnCompositionLoadedListener addlottieoncompositionloadedlistenerOnPostMessage = ((ServiceLoaderComponentRegistryExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ServiceLoaderComponentRegistryExternalSyntheticLambda0.class)).onPostMessage();
            int i3 = getInterfaceDescriptor + 123;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return addlottieoncompositionloadedlistenerOnPostMessage;
        }
        Response response2 = Response.onNavigationEvent;
        ((ServiceLoaderComponentRegistryExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ServiceLoaderComponentRegistryExternalSyntheticLambda0.class)).onPostMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final addAnimatorPauseListener asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        addAnimatorPauseListener addanimatorpauselistener = (addAnimatorPauseListener) onNavigationEvent.getValue();
        int i4 = getInterfaceDescriptor + 13;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return addanimatorpauselistener;
    }

    private static final addAnimatorPauseListener asInterface() {
        addAnimatorPauseListener addanimatorpauselistenerOnMessageChannelReady;
        int i = 2 % 2;
        int i2 = access000 + 47;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            addanimatorpauselistenerOnMessageChannelReady = ((ServiceLoaderComponentRegistryExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ServiceLoaderComponentRegistryExternalSyntheticLambda0.class)).onMessageChannelReady();
            int i3 = 20 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            addanimatorpauselistenerOnMessageChannelReady = ((ServiceLoaderComponentRegistryExternalSyntheticLambda0) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), ServiceLoaderComponentRegistryExternalSyntheticLambda0.class)).onMessageChannelReady();
        }
        int i4 = access000 + 15;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return addanimatorpauselistenerOnMessageChannelReady;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        Object obj2 = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(obj, str, null), (access13800) objArr[3]);
        int i2 = access000 + 79;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }

    public final Object IAuthTabCallback(@NotNull Pair<String, ? extends Object>[] pairArr, @NotNull access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(pairArr, null), access13800Var);
        int i2 = access000 + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends String>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int[] onWarmupCompleted = {-790900235, -2046263359, 1366988306, -2050334808, 1444554851, 2021553414, -193032062, -628145388, 1686905740, -80940008, -2096104936, -1317764256, -2026352842, 2039668468, 1198151811, 1274554635, 1525170855, -2002445469};
        final /* synthetic */ Pair<String, Object>[] $keysWithDefault;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Pair<String, ? extends Object>[] pairArr, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$keysWithDefault = pairArr;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$keysWithDefault, access13800Var);
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Map<String, String>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Map<String, String>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
        
            if (r2.onNavigationEvent(false, (o.access13800<? super kotlin.Unit>) r14) != r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
        
            if (r2.onNavigationEvent(false, (o.access13800<? super kotlin.Unit>) r14) != r1) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            trimMetadataStringsTo trimmetadatastringsto;
            long j;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                long jNanoTime = System.nanoTime();
                trimMetadataStringsTo trimmetadatastringstoOnNavigationEvent = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.onNavigationEvent();
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                if (!((Boolean) LifecyclesKtawaitStarted21.onExtraCallback(new Object[0], 2127325253, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2127325250, iIAuthTabCallback)).booleanValue()) {
                    int i3 = onExtraCallbackWithResult + 9;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                        this.L$0 = trimmetadatastringstoOnNavigationEvent;
                        this.J$0 = jNanoTime;
                        this.label = 0;
                    } else {
                        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted212 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                        this.L$0 = trimmetadatastringstoOnNavigationEvent;
                        this.J$0 = jNanoTime;
                        this.label = 1;
                    }
                }
                trimmetadatastringsto = trimmetadatastringstoOnNavigationEvent;
                j = jNanoTime;
            } else {
                if (i2 != 1) {
                    int i4 = onExtraCallback + 57;
                    int i5 = i4 % 128;
                    onExtraCallbackWithResult = i5;
                    int i6 = i4 % 2;
                    if (i2 != 2) {
                        Object[] objArr = new Object[1];
                        a(new int[]{-1309352769, 167397235, -1031535454, -1211976658, -1628366340, 1218718959, 1694065241, 1426506446, -34725819, 1666160839, 1857967837, 738901339, 1016534642, -1629321906, 1978257956, -1982803824, 1261584617, 1217489417, 882822850, 1025096490, 790725249, -1937481012, -1808240824, 1728880503}, 47 - View.resolveSize(0, 0), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    int i7 = i5 + 115;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                j = this.J$0;
                trimmetadatastringsto = (trimMetadataStringsTo) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted213 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            Pair<String, Object>[] pairArr = this.$keysWithDefault;
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            this.L$0 = access15400.onNavigationEvent(trimmetadatastringsto);
            this.J$0 = j;
            this.label = 2;
            Object[] objArr2 = {lifecyclesKtawaitStarted213, Long.valueOf(j), trimmetadatastringsto, pairArr2, this};
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(objArr2, 845648892, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -845648891, iIAuthTabCallback2);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                int i9 = onExtraCallback + 97;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return objOnExtraCallback;
            }
            return objOnWarmupCompleted;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onWarmupCompleted;
            long j = 0;
            int i3 = -1469660336;
            int i4 = 0;
            if (iArr3 != null) {
                int i5 = $10 + 63;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 35;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 71 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i6 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 72, KeyEvent.keyCodeFromString("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i6++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    j = 0;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i4] = Integer.valueOf(iArr5[i8]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(i4), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72, 8848 - TextUtils.indexOf("", "", i4, i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i8++;
                    i3 = -1469660336;
                    i4 = 0;
                }
                iArr5 = iArr6;
            }
            int i9 = i4;
            System.arraycopy(iArr5, i9, iArr4, i9, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i10 = $11 + 105;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i12 = 0;
                for (int i13 = 16; i12 < i13; i13 = 16) {
                    int i14 = $11 + 109;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 22252), 39 - Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 16787517, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i12 += 119;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.alpha(0)), 38 - ExpandableListView.getPackedPositionChild(0L), 10301 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i12++;
                    }
                }
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4033), 78 - KeyEvent.keyCodeFromString(""), View.resolveSize(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends String>>, Object> {
        final /* synthetic */ Pair<String, Object>[] $keysWithDefault;
        int label;
        private static final byte[] $$a = {114, 69, -115, -114};
        private static final int $$b = 46;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int IAuthTabCallback = 1;
        private static long onExtraCallback = -2507991853076884756L;
        private static int onExtraCallbackWithResult = -1776194565;
        private static char onWarmupCompleted = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, byte b3) {
            int i;
            int i2;
            byte[] bArr = $$a;
            int i3 = (b3 * 3) + 4;
            int i4 = (b2 * 4) + 1;
            int i5 = b + 109;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i6 = i4;
                int i7 = i3;
                i2 = 0;
                i3++;
                i5 = i7 + (-i6);
                i = i2;
                int i8 = i3;
                int i9 = i5;
                i2 = i + 1;
                bArr2[i] = (byte) i9;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i8];
                i3 = i8;
                i7 = i9;
                i3++;
                i5 = i7 + (-i6);
                i = i2;
                int i82 = i3;
                int i92 = i5;
                i2 = i + 1;
                bArr2[i] = (byte) i92;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                int i822 = i3;
                int i922 = i5;
                i2 = i + 1;
                bArr2[i] = (byte) i922;
                if (i2 == i4) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Pair<String, ? extends Object>[] pairArr, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$keysWithDefault = pairArr;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$keysWithDefault, access13800Var);
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Map<String, String>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Map<String, String>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 47;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 107;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.getSize(0) + 151774512, new char[]{61384, 27817, 37893, 47383, 4364, 58966, 27804, 13850, 44546, 16651, 14667, 55292, 34644, 63759, 8444, 438, 63855, 21641, 19283, 58089, 61072, 63467, 63912, 16451, 17460, 6144, 53856, 2699, 64454, 29083, 16285, 62540, 47109, 45921, 20925, 12625, 3637, 18304, 38477, 47627, 15097, 32906, 27919, 40364, 29775, 6096, 51164}, new char[]{14615, 2022, 56964, 45323}, new char[]{12479, 3045, 34313, 17773}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onNavigationEvent + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            long jNanoTime = System.nanoTime();
            trimMetadataStringsTo trimmetadatastringstoOnNavigationEvent = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.onNavigationEvent();
            Pair<String, Object>[] pairArr = this.$keysWithDefault;
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            this.label = 1;
            Object[] objArr2 = {lifecyclesKtawaitStarted21, Long.valueOf(jNanoTime), trimmetadatastringstoOnNavigationEvent, pairArr2, this};
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(objArr2, 845648892, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -845648891, iIAuthTabCallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            int i6 = IAuthTabCallback + 15;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return objOnExtraCallback;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
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
                int i4 = $11 + 123;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 43 - Color.blue(0), 1452 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 49124), 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - ((byte) KeyEvent.getModifierMetaStateMask())), 51 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - ImageFormat.getBitsPerPixel(0)), 29 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                i2 = 2;
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
            int i6 = $10 + 13;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    public final Object onNavigationEvent(@NotNull Pair<String, ? extends Object>[] pairArr, @NotNull access13800<? super Map<String, String>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallback(pairArr, null), access13800Var);
        int i2 = getInterfaceDescriptor + 53;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T onWarmupCompleted(String str, String str2, T t) throws Throwable {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 109;
        int i4 = i3 % 128;
        getInterfaceDescriptor = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = t instanceof String;
            obj.hashCode();
            throw null;
        }
        if (t instanceof String) {
            if (str2 == 0) {
                return null;
            }
            int i5 = i2 + 19;
            int i6 = i5 % 128;
            getInterfaceDescriptor = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 123;
            access000 = i8 % 128;
            if (i8 % 2 != 0) {
                return str2;
            }
            throw null;
        }
        try {
            if (t instanceof Integer) {
                return (T) Integer.valueOf(Integer.parseInt(str2));
            }
            if (t instanceof Long) {
                return (T) Long.valueOf(Long.parseLong(str2));
            }
            if (t instanceof Double) {
                int i9 = i4 + 43;
                access000 = i9 % 128;
                int i10 = i9 % 2;
                return (T) Double.valueOf(Double.parseDouble(str2));
            }
            if (!(t instanceof Boolean)) {
                return null;
            }
            int i11 = i2 + 111;
            getInterfaceDescriptor = i11 % 128;
            if (i11 % 2 == 0) {
                return (T) Boolean.valueOf(Boolean.parseBoolean(str2));
            }
            Boolean.valueOf(Boolean.parseBoolean(str2));
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            auth authVar = auth.onNavigationEvent;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((short) ((-126) - (Process.myPid() >> 22)), (byte) (123 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1960142792 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1727194200) - TextUtils.indexOf("", "", 0, 0), (-86) - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a((short) (Gravity.getAbsoluteGravity(0, 0) - 11), (byte) (108 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1960142826 - View.resolveSize(0, 0), Color.argb(0, 0, 0, 0) - 1727194226, (ViewConfiguration.getTapTimeout() >> 16) - 97, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(t);
            Object[] objArr3 = new Object[1];
            a((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 107), (byte) ((-105) - ImageFormat.getBitsPerPixel(0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1960142850, (-1727194226) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) - 119, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(message);
            Object[] objArr4 = new Object[1];
            a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 46), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1960142850, View.MeasureSpec.getSize(0) - 1727194184, (ViewConfiguration.getScrollBarSize() >> 8) - 115, objArr4);
            auth.onExtraCallback(authVar, ((String) objArr4[0]).intern(), sb.toString(), null, 4, null);
            return null;
        }
    }

    private final String IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Integer) && (!Intrinsics.areEqual(obj, LongCompanionObject.INSTANCE))) {
            int i2 = getInterfaceDescriptor + 65;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(obj, DoubleCompanionObject.INSTANCE);
                throw null;
            }
            if ((!Intrinsics.areEqual(obj, DoubleCompanionObject.INSTANCE)) && (!Intrinsics.areEqual(obj, BooleanCompanionObject.INSTANCE))) {
                return "";
            }
        }
        String string = obj.toString();
        int i3 = getInterfaceDescriptor + 69;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onNavigationEvent<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static char[] onWarmupCompleted = {27263, 27180, 27176, 27170, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27142, 27173, 27196, 27196, 27171, 27174, 27144, 27245, 27141, 27198, 27168, 27168, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175};
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ String $key;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(T t, String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$defaultValue = t;
            this.$key = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$defaultValue, this.$key, access13800Var);
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super T> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[PHI: r2
          0x006d: PHI (r2v17 java.lang.Object) = (r2v4 java.lang.Object), (r2v19 java.lang.Object) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r2 r5
          0x0026: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v19 java.lang.Object) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x0026: PHI (r5v1 int) = (r5v0 int), (r5v16 int) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i;
            trimMetadataStringsTo trimmetadatastringsto;
            Object obj2;
            long j;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Object objOnExtraCallback;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 67;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 94 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    long jNanoTime = System.nanoTime();
                    trimMetadataStringsTo trimmetadatastringstoOnNavigationEvent = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.onNavigationEvent();
                    if (!((Boolean) LifecyclesKtawaitStarted21.onExtraCallback(new Object[0], 2127325253, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2127325250, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).booleanValue()) {
                        int i5 = IAuthTabCallback + 27;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                            this.L$0 = trimmetadatastringstoOnNavigationEvent;
                            this.J$0 = jNanoTime;
                            this.label = 0;
                            if (lifecyclesKtawaitStarted21.onNavigationEvent(true, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        } else {
                            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted212 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                            this.L$0 = trimmetadatastringstoOnNavigationEvent;
                            this.J$0 = jNanoTime;
                            this.label = 1;
                            if (lifecyclesKtawaitStarted212.onNavigationEvent(false, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                    }
                    obj2 = objOnWarmupCompleted;
                    j = jNanoTime;
                    trimmetadatastringsto = trimmetadatastringstoOnNavigationEvent;
                } else if (i == 1) {
                    long j2 = this.J$0;
                    trimMetadataStringsTo trimmetadatastringsto2 = (trimMetadataStringsTo) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    trimmetadatastringsto = trimmetadatastringsto2;
                    obj2 = objOnWarmupCompleted;
                    j = j2;
                } else {
                    if (i != 2) {
                        Object[] objArr = new Object[1];
                        a(new int[]{0, 47, 0, 0}, false, new byte[]{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    j = this.J$0;
                    objectRef = (Ref.ObjectRef) this.L$2;
                    objectRef2 = (Ref.ObjectRef) this.L$1;
                    trimmetadatastringsto = (trimMetadataStringsTo) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = obj;
                }
                objectRef2 = new Ref.ObjectRef();
                setCompositionTask setcompositiontaskOnExtraCallbackWithResult = LifecyclesKtawaitStarted21.onExtraCallbackWithResult(LifecyclesKtawaitStarted21.IAuthTabCallback);
                String str = this.$key;
                this.L$0 = trimmetadatastringsto;
                this.L$1 = objectRef2;
                this.L$2 = objectRef2;
                this.J$0 = j;
                this.label = 2;
                objOnExtraCallback = setcompositiontaskOnExtraCallbackWithResult.onExtraCallback(str, (access13800<? super setProgressInternal>) this);
                if (objOnExtraCallback != obj2) {
                    return obj2;
                }
                objectRef = objectRef2;
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
                objectRef2 = new Ref.ObjectRef();
                setCompositionTask setcompositiontaskOnExtraCallbackWithResult2 = LifecyclesKtawaitStarted21.onExtraCallbackWithResult(LifecyclesKtawaitStarted21.IAuthTabCallback);
                String str2 = this.$key;
                this.L$0 = trimmetadatastringsto;
                this.L$1 = objectRef2;
                this.L$2 = objectRef2;
                this.J$0 = j;
                this.label = 2;
                objOnExtraCallback = setcompositiontaskOnExtraCallbackWithResult2.onExtraCallback(str2, (access13800<? super setProgressInternal>) this);
                if (objOnExtraCallback != obj2) {
                }
            }
            trimMetadataStringsTo trimmetadatastringsto3 = trimmetadatastringsto;
            objectRef.element = objOnExtraCallback;
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted213 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            if (((addLottieOnCompositionLoadedListener) LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted213}, -1825845273, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1825845275, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).onWarmupCompleted() && LifecyclesKtawaitStarted21.onNavigationEvent(lifecyclesKtawaitStarted213).onExtraCallback(this.$key)) {
                objectRef2.element = new setProgressInternal(LifecyclesKtawaitStarted21.onNavigationEvent(lifecyclesKtawaitStarted213).onNavigationEvent(this.$key), r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CONFIGURED);
                int i6 = onExtraCallback + 43;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            String strOnNavigationEvent = ((setProgressInternal) objectRef2.element).onNavigationEvent();
            Object objOnWarmupCompleted2 = null;
            if (strOnNavigationEvent != null) {
                int i8 = IAuthTabCallback + 97;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    LifecyclesKtawaitStarted21.onWarmupCompleted(lifecyclesKtawaitStarted213, this.$key, strOnNavigationEvent, this.$defaultValue);
                    objOnWarmupCompleted2.hashCode();
                    throw null;
                }
                objOnWarmupCompleted2 = LifecyclesKtawaitStarted21.onWarmupCompleted(lifecyclesKtawaitStarted213, this.$key, strOnNavigationEvent, this.$defaultValue);
            }
            r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0 r8lambdaxnlsruwnzswlalzcj_icpo2spk0 = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult;
            String str3 = this.$key;
            T t = this.$defaultValue;
            ALCFaceSDK4 aLCFaceSDK4IAuthTabCallback = r8lambdaxnlsruwnzswlalzcj_icpo2spk0.IAuthTabCallback();
            if (aLCFaceSDK4IAuthTabCallback != null) {
                try {
                    aLCFaceSDK4IAuthTabCallback.IAuthTabCallback(new ALCFaceSDKExternalSyntheticLambda4(ALCFaceSDK3.V2, str3, objOnWarmupCompleted2 == null ? t : objOnWarmupCompleted2, t, objOnWarmupCompleted2 != null ? ((setProgressInternal) objectRef2.element).onExtraCallbackWithResult() : r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT, System.nanoTime() - j, null, trimmetadatastringsto3, 64, null));
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
            }
            return objOnWarmupCompleted2 == null ? this.$defaultValue : objOnWarmupCompleted2;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = onWarmupCompleted;
            float f = 0.0f;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 75;
                    $11 = i8 % 128;
                    int i9 = i8 % i;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 36, TextUtils.lastIndexOf("", '0', 0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        i = 2;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i10 = $11 + 87;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i12 = $11 + 115;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 10935), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 66, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            Object obj = null;
                            cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        }
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 10935), 65 - (KeyEvent.getMaxKeyCode() >> 16), Process.getGidForName("") + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } else {
                        int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 30, 17657 - Gravity.getAbsoluteGravity(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    try {
                        Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49467), 70 - Color.red(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i16, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i16);
            }
            if (z) {
                int i17 = $11 + 121;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    int i19 = $11 + 77;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[PHI: r2 r5
      0x0035: PHI (r2v7 o.LifecyclesKtawaitStarted21$IAuthTabCallback) = (r2v6 o.LifecyclesKtawaitStarted21$IAuthTabCallback), (r2v9 o.LifecyclesKtawaitStarted21$IAuthTabCallback) binds: [B:12:0x0033, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r5v6 int) = (r5v5 int), (r5v8 int) binds: [B:12:0x0033, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(boolean z, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        int i;
        Throwable th;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = access000 + 37;
        int i6 = i5 % 128;
        getInterfaceDescriptor = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            boolean z2 = access13800Var instanceof IAuthTabCallback;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallback) {
            int i7 = i6 + 39;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i3 = iAuthTabCallback.label;
                int i8 = 26 / 0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i3 - 2147483648;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(access13800Var);
                    int i9 = getInterfaceDescriptor + 67;
                    access000 = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i3 = iAuthTabCallback.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj2 = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i11 = iAuthTabCallback.label;
        try {
            if (i11 == 0) {
                ResultKt.onNavigationEvent(obj2);
                jni_ygnodestylegetflexbasisjni = onWarmupCompleted;
                iAuthTabCallback.L$0 = jni_ygnodestylegetflexbasisjni;
                iAuthTabCallback.Z$0 = z;
                iAuthTabCallback.I$0 = 0;
                iAuthTabCallback.label = 1;
                if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback((Object) null, iAuthTabCallback) != objOnWarmupCompleted) {
                    i = 0;
                }
                return objOnWarmupCompleted;
            }
            if (i11 != 1) {
                int i12 = access000 + 39;
                getInterfaceDescriptor = i12 % 128;
                int i13 = i12 % 2;
                if (i11 != 2) {
                    Object[] objArr = new Object[1];
                    a((short) ((-48) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) ((-56) - TextUtils.lastIndexOf("", '0')), 1960142854 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getCapsMode("", 0, 0) - 1727194171, (-75) - ExpandableListView.getPackedPositionChild(0L), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) iAuthTabCallback.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                    onExtraCallbackWithResult = true;
                    Unit unit = Unit.INSTANCE;
                    jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                    i2 = access000 + 27;
                    getInterfaceDescriptor = i2 % 128;
                    if (i2 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
                    jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
                    throw th;
                }
            }
            int i14 = iAuthTabCallback.I$0;
            boolean z3 = iAuthTabCallback.Z$0;
            jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj2);
            i = i14;
            z = z3;
            if (!onExtraCallbackWithResult || z) {
                setCompositionTask setcompositiontaskIAuthTabCallbackDefault = IAuthTabCallback.IAuthTabCallbackDefault();
                iAuthTabCallback.L$0 = jni_ygnodestylegetflexbasisjni;
                iAuthTabCallback.Z$0 = z;
                iAuthTabCallback.I$0 = i;
                iAuthTabCallback.I$1 = 0;
                iAuthTabCallback.label = 2;
                if (setcompositiontaskIAuthTabCallbackDefault.onExtraCallbackWithResult(iAuthTabCallback) != objOnWarmupCompleted) {
                    jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
                    onExtraCallbackWithResult = true;
                    Unit unit2 = Unit.INSTANCE;
                    jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                    i2 = access000 + 27;
                    getInterfaceDescriptor = i2 % 128;
                    if (i2 % 2 == 0) {
                    }
                }
                return objOnWarmupCompleted;
            }
            jni_ygnodestylegetflexbasisjni2 = jni_ygnodestylegetflexbasisjni;
            Unit unit22 = Unit.INSTANCE;
            jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
            i2 = access000 + 27;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(long j, trimMetadataStringsTo trimmetadatastringsto, Pair<String, ? extends Object>[] pairArr, access13800<? super Map<String, String>> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        long j2;
        Map map;
        trimMetadataStringsTo trimmetadatastringsto2;
        String strOnNavigationEvent;
        setProgressInternal setprogressinternalOnWarmupCompleted;
        Map map2;
        int i = 2;
        int i2 = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i3 = onwarmupcompleted.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i3 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onwarmupcompleted.label;
        int i5 = 1;
        if (i4 != 0) {
            int i6 = getInterfaceDescriptor + 99;
            access000 = i6 % 128;
            if (i6 % 2 != 0 ? i4 != 1 : i4 != 0) {
                Object[] objArr = new Object[1];
                a((short) ((-47) - Color.red(0)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 54), (Process.myPid() >> 22) + 1960142855, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1727194172, Process.getGidForName("") - 73, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            long j3 = onwarmupcompleted.J$0;
            map = (Map) onwarmupcompleted.L$2;
            trimmetadatastringsto2 = (trimMetadataStringsTo) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            j2 = j3;
        } else {
            ResultKt.onNavigationEvent(obj);
            Map mapAsInterface = access8100.asInterface(pairArr);
            String[] strArr = (String[]) mapAsInterface.keySet().toArray(new String[0]);
            setCompositionTask setcompositiontaskIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            onwarmupcompleted.L$0 = trimmetadatastringsto;
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(pairArr);
            onwarmupcompleted.L$2 = mapAsInterface;
            onwarmupcompleted.L$3 = access15400.onNavigationEvent(strArr);
            j2 = j;
            onwarmupcompleted.J$0 = j2;
            onwarmupcompleted.label = 1;
            Object objOnExtraCallback = setcompositiontaskIAuthTabCallbackDefault.onExtraCallback(strArr2, (access13800<? super Map<String, setProgressInternal>>) onwarmupcompleted);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            map = mapAsInterface;
            obj = objOnExtraCallback;
            trimmetadatastringsto2 = trimmetadatastringsto;
        }
        Map map3 = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = IAuthTabCallback;
            Object obj2 = null;
            if (lifecyclesKtawaitStarted21.onTransact().onWarmupCompleted() != i5) {
                strOnNavigationEvent = null;
            } else {
                int i7 = access000 + i5;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % i;
                strOnNavigationEvent = lifecyclesKtawaitStarted21.asBinder().onNavigationEvent(str);
            }
            if (strOnNavigationEvent != null) {
                setprogressinternalOnWarmupCompleted = new setProgressInternal(strOnNavigationEvent, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CONFIGURED);
            } else {
                setprogressinternalOnWarmupCompleted = (setProgressInternal) map3.get(str);
                if (setprogressinternalOnWarmupCompleted == null) {
                    setprogressinternalOnWarmupCompleted = setProgressInternal.Companion.onWarmupCompleted();
                }
            }
            String strOnNavigationEvent2 = setprogressinternalOnWarmupCompleted.onNavigationEvent();
            ALCFaceSDK4 aLCFaceSDK4IAuthTabCallback = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.IAuthTabCallback();
            if (aLCFaceSDK4IAuthTabCallback != null) {
                try {
                    try {
                        map2 = map3;
                        try {
                            aLCFaceSDK4IAuthTabCallback.IAuthTabCallback(new ALCFaceSDKExternalSyntheticLambda4(ALCFaceSDK3.V2, str, strOnNavigationEvent2 == null ? lifecyclesKtawaitStarted21.IAuthTabCallback(value) : strOnNavigationEvent2, lifecyclesKtawaitStarted21.IAuthTabCallback(value), strOnNavigationEvent2 != null ? setprogressinternalOnWarmupCompleted.onExtraCallbackWithResult() : r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT, System.nanoTime() - j2, access14000.onNavigationEvent(map.size()), trimmetadatastringsto2));
                        } catch (Throwable unused) {
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable unused2) {
                }
            } else {
                map2 = map3;
            }
            if (strOnNavigationEvent2 == null) {
                int i9 = getInterfaceDescriptor + 17;
                access000 = i9 % 128;
                i = 2;
                if (i9 % 2 == 0) {
                    IAuthTabCallback.IAuthTabCallback(value);
                    obj2.hashCode();
                    throw null;
                }
                strOnNavigationEvent2 = IAuthTabCallback.IAuthTabCallback(value);
            } else {
                i = 2;
            }
            linkedHashMap.put(key, strOnNavigationEvent2);
            map3 = map2;
            i5 = 1;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onTransact)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43424), TextUtils.getCapsMode("", 0, 0) + 42, TextUtils.indexOf("", "", 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 107;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            long j2 = 0;
            if (i4 != 0) {
                int i9 = $11;
                int i10 = i9 + 93;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr2 = asInterface;
                if (bArr2 != null) {
                    int i12 = i9 + 103;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    int i13 = i5;
                    while (i13 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i13])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char c = (char) (12844 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int iRed = Color.red(0) + 55;
                            int i14 = (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 2168;
                            byte b2 = (byte) ($$a[0] - 1);
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, iRed, i14, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i13] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i13++;
                        j2 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i15 = $11 + 37;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    byte[] bArr3 = asInterface;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackStub)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) "", '0')), 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 22439 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (access100[i + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackStub ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asBinder), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 85, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = asInterface;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i18 = $10 + 1;
                    $11 = i18 % 128;
                    boolean z = i18 % 2 != 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i19 = $11 + 101;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        if (z) {
                            byte[] bArr6 = asInterface;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = access100;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static final /* synthetic */ addLottieOnCompositionLoadedListener onWarmupCompleted(LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return (addLottieOnCompositionLoadedListener) onExtraCallback(new Object[]{lifecyclesKtawaitStarted21}, -1825845273, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1825845275, iIAuthTabCallback);
    }

    public static final /* synthetic */ Object IAuthTabCallback(LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21, long j, trimMetadataStringsTo trimmetadatastringsto, Pair[] pairArr, access13800 access13800Var) {
        Object[] objArr = {lifecyclesKtawaitStarted21, Long.valueOf(j), trimmetadatastringsto, pairArr, access13800Var};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return onExtraCallback(objArr, 845648892, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -845648891, iIAuthTabCallback);
    }

    public static final /* synthetic */ boolean onWarmupCompleted() {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return ((Boolean) onExtraCallback(new Object[0], 2127325253, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -2127325250, iIAuthTabCallback)).booleanValue();
    }

    public final <T> Object onNavigationEvent(@NotNull String str, @NotNull T t, @NotNull access13800<? super T> access13800Var) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return onExtraCallback(new Object[]{this, str, t, access13800Var}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
    }

    static void onExtraCallback() {
        IAuthTabCallbackStub = 795689008;
        onTransact = -1538795407;
        asBinder = -1028309866;
        asInterface = new byte[]{19, -41, 82, -27, -9, -90, 91, -2, -8, -77, 54, 8, -25, -16, 9, 2, -32, 6, -93, 54, 15, -16, -32, 0, -95, 64, -10, -91, 77, 10, 8, -2, -7, -42, -112, 116, -45, -82, 101, 99, 99, -100, 102, -81, -126, -109, 125, 125, 50, -20, -86, -87, 125, 103, -85, 76, -94, -33, 22, -13, 81, AbstractSmartcard.BYTE_READ_MORE, 91, 101, -13, 99, 109, -10, 107, -15, -4, -79, -88, 100, -7, 98, -59, 87, 50, 106, AbstractSmartcard.BYTE_RESPONSE_LENGTH, 87, -8, -13, -78, -11, -87, AbstractSmartcard.BYTE_READ_MORE, -15, -25, -1, -15, -78, 87, 50, 104, 104, -14, -2, AbstractSmartcard.BYTE_READ_MORE, -71, -11, -81, 105, -60, -92, -16, -7, 110, 8, 8, 8, 8, 8};
    }
}
