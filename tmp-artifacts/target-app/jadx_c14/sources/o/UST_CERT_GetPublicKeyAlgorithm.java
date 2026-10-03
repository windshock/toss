package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.LruCache;
import com.google.gson.reflect.TypeToken;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.UST_CERT_GetPublicKeyAlgorithm;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetPublicKeyAlgorithm implements ALCOcclusion, findResAndMsg {
    public static final onWarmupCompleted Companion;
    private static final String IAuthTabCallback;
    private static int access000;
    private static int extraCallbackWithResult;
    private static final String onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private final CoroutineContext IAuthTabCallbackDefault;
    private final AtomicBoolean IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private final String asBinder;
    private final Context asInterface;
    private final Lazy onExtraCallback;
    private final AppSetIdAndScope1 onTransact;
    private onExtraCallback onWarmupCompleted;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 0;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;

    static final class access000 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        access000(access13800<? super access000> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -810500766, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{UST_CERT_GetPublicKeyAlgorithm.this, null, this}, 810500769);
        }
    }

    static final class asBinder extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(UST_CERT_GetPublicKeyAlgorithm.this, this);
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback(UST_CERT_GetPublicKeyAlgorithm.this, this);
        }
    }

    private static String $$c(short s, int i, short s2) {
        int i2 = 105 - (i * 4);
        int i3 = s2 * 3;
        int i4 = (s * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += -i3;
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i4];
            i4++;
        }
    }

    static {
        extraCallbackWithResult = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 9 - TextUtils.getCapsMode("", 0, 0), new char[]{65523, 0, 1, 65522, '\'', 65526, 65502, '!', '$', 65527, 65508, 65501, 5, ' '}, false, 210 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, TextUtils.getOffsetAfter("", 0) + 9, new char[]{65508, 65515, 65529, 65514, 24, '-', 25, 65515, '\r', 65529, 65512, '*', 65507, 22}, false, 205 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Companion = new onWarmupCompleted(null);
        onNavigationEvent = 8;
        int i = readTypedObject + 39;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ File onExtraCallback(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        File fileAsBinder = asBinder(uST_CERT_GetPublicKeyAlgorithm);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = getInterfaceDescriptor + 85;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return fileAsBinder;
    }

    public static /* synthetic */ onNavigationEvent onExtraCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationeventIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return onnavigationeventIAuthTabCallbackStub;
    }

    public static /* synthetic */ onNavigationEvent onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationeventAsBinder = asBinder();
        int i4 = access100 + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventAsBinder;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = ~(i4 | i6);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i4 + i6 + i3 + ((-1585779005) * i5) + (640148872 * i2);
        int i17 = i16 * i16;
        int i18 = (i4 * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i3) + (1159200768 * i5) + ((-734003200) * i2) + (2089549824 * i17);
        int i19 = (i4 * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i3 * (-1291221671)) + (i5 * (-1079815989)) + (i2 * 669414472) + (i17 * 145489920);
        int i20 = i18 + (i19 * i19 * (-1699479552));
        if (i20 != 1) {
            if (i20 == 2) {
                return IAuthTabCallback(objArr);
            }
            if (i20 == 3) {
                return onNavigationEvent(objArr);
            }
            UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm = (UST_CERT_GetPublicKeyAlgorithm) objArr[0];
            int i21 = 2 % 2;
            getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(uST_CERT_GetPublicKeyAlgorithm, (CoroutineContext) null, (setRandomHost) null, uST_CERT_GetPublicKeyAlgorithm.new IAuthTabCallbackStub(null), 3, (Object) null);
            int i22 = access100 + 105;
            getInterfaceDescriptor = i22 % 128;
            int i23 = i22 % 2;
            return getpackagetypeOnNavigationEvent;
        }
        UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm2 = (UST_CERT_GetPublicKeyAlgorithm) objArr[0];
        int i24 = 2 % 2;
        int i25 = access100;
        int i26 = i25 + 3;
        getInterfaceDescriptor = i26 % 128;
        int i27 = i26 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = uST_CERT_GetPublicKeyAlgorithm2.onTransact;
        int i28 = i25 + 75;
        getInterfaceDescriptor = i28 % 128;
        int i29 = i28 % 2;
        return appSetIdAndScope1;
    }

    public UST_CERT_GetPublicKeyAlgorithm(@NotNull Context context, @NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface = context;
        this.asBinder = str;
        this.IAuthTabCallbackDefault = putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null));
        Object[] objArr = new Object[1];
        a(15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-16777208) - Color.rgb(0, 0, 0), new char[]{3, 0, 5, 14, 65502, '\f', '\f', 65501, 21, 65535, 5, '\b', 11, 65516, 1}, true, (ViewConfiguration.getTouchSlop() >> 8) + 228, objArr);
        this.onTransact = ea10.onExtraCallbackWithResult(((String) objArr[0]).intern());
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppBridgeRemotePolicyPoolImpl$$ExternalSyntheticLambda0
            public final Object invoke() {
                return UST_CERT_GetPublicKeyAlgorithm.onExtraCallback(this.f$0);
            }
        });
        this.IAuthTabCallbackStub = new AtomicBoolean(false);
        this.onWarmupCompleted = new onExtraCallback();
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppBridgeRemotePolicyPoolImpl$$ExternalSyntheticLambda1
            public final Object invoke() {
                return UST_CERT_GetPublicKeyAlgorithm.onExtraCallbackWithResult();
            }
        });
        this.IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.core.AppBridgeRemotePolicyPoolImpl$$ExternalSyntheticLambda2
            public final Object invoke() {
                return UST_CERT_GetPublicKeyAlgorithm.onExtraCallback();
            }
        });
    }

    public static final /* synthetic */ File IAuthTabCallback(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        File fileOnWarmupCompleted = uST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = getInterfaceDescriptor + 83;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return fileOnWarmupCompleted;
    }

    public static final /* synthetic */ Object IAuthTabCallback(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = uST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback((access13800<? super IAuthTabCallback>) access13800Var);
        int i4 = getInterfaceDescriptor + 51;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm = (UST_CERT_GetPublicKeyAlgorithm) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 31;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        AtomicBoolean atomicBoolean = uST_CERT_GetPublicKeyAlgorithm.IAuthTabCallbackStub;
        int i5 = i2 + 119;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return atomicBoolean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ onExtraCallback onExtraCallbackWithResult(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = uST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted;
        if (i3 == 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm = (UST_CERT_GetPublicKeyAlgorithm) objArr[0];
        Collection<ALCLiveness> collection = (Collection) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return uST_CERT_GetPublicKeyAlgorithm.onNavigationEvent(collection, access13800Var);
        }
        uST_CERT_GetPublicKeyAlgorithm.onNavigationEvent(collection, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = uST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted((access13800<? super IAuthTabCallback>) access13800Var);
        int i4 = access100 + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ String onWarmupCompleted(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str = uST_CERT_GetPublicKeyAlgorithm.asBinder;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public CoroutineContext getCoroutineContext() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 107;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        CoroutineContext coroutineContext = this.IAuthTabCallbackDefault;
        int i5 = i2 + 55;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return coroutineContext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final File onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        File file = (File) this.onExtraCallback.getValue();
        int i4 = getInterfaceDescriptor + 113;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    private static final File asBinder(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm) {
        int i = 2 % 2;
        File file = new File(uST_CERT_GetPublicKeyAlgorithm.asInterface.getCacheDir(), "policy");
        if (!file.exists()) {
            int i2 = access100 + 33;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                file.mkdirs();
                int i3 = 78 / 0;
            } else {
                file.mkdirs();
            }
        }
        File file2 = new File(file, "cache");
        int i4 = access100 + 97;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return file2;
    }

    private final onNavigationEvent IAuthTabCallbackDefault() {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = access100 + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onnavigationevent = (onNavigationEvent) this.IAuthTabCallback_Parcel.getValue();
            int i3 = 67 / 0;
        } else {
            onnavigationevent = (onNavigationEvent) this.IAuthTabCallback_Parcel.getValue();
        }
        int i4 = getInterfaceDescriptor + 43;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final onNavigationEvent asBinder() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 14, (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, new char[]{65523, 0, 1, 65522, '\'', 65526, 65502, '!', '$', 65527, 65508, 65501, 5, ' '}, false, (Process.myTid() >> 22) + 211, objArr);
        String strIntern = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        onNavigationEvent onnavigationevent = new onNavigationEvent(strIntern, 0, 2, defaultConstructorMarker);
        int i2 = getInterfaceDescriptor + 41;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationevent;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private final onNavigationEvent onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationevent = (onNavigationEvent) this.IAuthTabCallbackStubProxy.getValue();
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return onnavigationevent;
    }

    private static final onNavigationEvent IAuthTabCallbackStub() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(14 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, new char[]{65508, 65515, 65529, 65514, 24, '-', 25, 65515, '\r', 65529, 65512, '*', 65507, 22}, false, 205 - KeyEvent.normalizeMetaState(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        onNavigationEvent onnavigationevent = new onNavigationEvent(strIntern, 0, 2, defaultConstructorMarker);
        int i2 = access100 + 113;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationevent;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    static final class IAuthTabCallback {
        public static final C0005IAuthTabCallback Companion;
        private static final IAuthTabCallback onExtraCallback;
        private final List<ALCLiveness> IAuthTabCallback;
        private final boolean onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(boolean z, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, list);
        }

        private IAuthTabCallback(boolean z, List<ALCLiveness> list) {
            this.onNavigationEvent = z;
            this.IAuthTabCallback = list;
        }

        public final List<ALCLiveness> IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final boolean onNavigationEvent() {
            return this.onNavigationEvent;
        }

        /* renamed from: o.UST_CERT_GetPublicKeyAlgorithm$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0005IAuthTabCallback {
            public /* synthetic */ C0005IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0005IAuthTabCallback() {
            }

            public final IAuthTabCallback onWarmupCompleted(@NotNull List<ALCLiveness> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new IAuthTabCallback(false, list, null);
            }

            public final IAuthTabCallback onExtraCallbackWithResult(@NotNull List<ALCLiveness> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new IAuthTabCallback(true, list, null);
            }

            public final IAuthTabCallback onExtraCallbackWithResult() {
                return IAuthTabCallback.onExtraCallback;
            }
        }

        static {
            C0005IAuthTabCallback c0005IAuthTabCallback = new C0005IAuthTabCallback(null);
            Companion = c0005IAuthTabCallback;
            onExtraCallback = c0005IAuthTabCallback.onWarmupCompleted(CollectionsKt.emptyList());
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super IAuthTabCallback>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static long onNavigationEvent = -990964989120064420L;
        Object L$0;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super IAuthTabCallback> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(access13800Var);
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            return objIAuthTabCallback;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $11 + 1;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $10 + 23;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16731404) - Color.rgb(0, 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 84, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 14185), View.MeasureSpec.makeMeasureSpec(0, 0) + 19, 8809 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
        
            if (r0 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f4, code lost:
        
            if (r0 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
        
            r0 = (java.util.List) r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
        
            r10 = new java.lang.Object[1];
            a(new char[]{11211, 39048, 23911, 49670, 11173, 47021, 939, 20378, 38571, 29819, 18150, 35160, 20773, 12599, 33843, 51798, 7273, 65533, 52007, 2005, 57002, 48299, 3763, 16598, 39423, 31095, 19879, 33368, 17444, 1590, 37738, 16152, 1918, 50420, 54891, 30870, 49599, 33185, 5559, 46483, 36011, 20083, 22760, 63298, 20263, 2865, 40489, 12376, 2664, 51703, 56683, 28122, 62638, 38587, 24755, 44703, 47076, 21366, 42996, 59416, 29191, 4145, 58676, 9474, 15671, 57073, 10346, 26264, 65471, 39863, 28596, 41861, 47781, 22651, 45800, 56644, 25902, 58742, 61488, 7699, 8297, 41971, 14190, 23490, 58085, 24729, 31415, 38022, 44489, 11626, 47598, 54866, 26668, 59965, 65301, 4883, 11110, 43255, 627, 19667, 38299, 30135, 16811, 35231, 20712, 12897, 33977}, android.text.TextUtils.indexOf("", "", 0), r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0116, code lost:
        
            throw new java.lang.NullPointerException(((java.lang.String) r10[0]).intern());
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 491
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithm.onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return UST_CERT_GetPublicKeyAlgorithm.this.new IAuthTabCallbackStub(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
        
            if (o.UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(r4, im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), r6, -810500766, r8, new java.lang.Object[]{r1, r3, r11}, 810500769) == r0) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.L$0
                o.UST_CERT_GetPublicKeyAlgorithm$IAuthTabCallback r0 = (o.UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback) r0
                kotlin.ResultKt.onNavigationEvent(r12)
                goto La2
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                kotlin.ResultKt.onNavigationEvent(r12)
                goto L30
            L23:
                kotlin.ResultKt.onNavigationEvent(r12)
                o.UST_CERT_GetPublicKeyAlgorithm r12 = o.UST_CERT_GetPublicKeyAlgorithm.this
                r11.label = r3
                java.lang.Object r12 = o.UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback(r12, r11)
                if (r12 == r0) goto La5
            L30:
                o.UST_CERT_GetPublicKeyAlgorithm$IAuthTabCallback r12 = (o.UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback) r12
                o.UST_CERT_GetPublicKeyAlgorithm r1 = o.UST_CERT_GetPublicKeyAlgorithm.this
                o.UST_CERT_GetPublicKeyAlgorithm$onExtraCallback r1 = o.UST_CERT_GetPublicKeyAlgorithm.onExtraCallbackWithResult(r1)
                java.util.List r4 = r12.IAuthTabCallback()
                java.util.Collection r4 = (java.util.Collection) r4
                r1.IAuthTabCallback(r4)
                o.UST_CERT_GetPublicKeyAlgorithm r1 = o.UST_CERT_GetPublicKeyAlgorithm.this
                java.lang.Object[] r9 = new java.lang.Object[]{r1}
                int r4 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                int r6 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                int r8 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                int r5 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                r7 = -831965141(0xffffffffce69382b, float:-9.781931E8)
                r10 = 831965143(0x3196c7d7, float:4.3882937E-9)
                java.lang.Object r1 = o.UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(r4, r5, r6, r7, r8, r9, r10)
                java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
                r1.set(r3)
                boolean r1 = r12.onNavigationEvent()
                if (r1 == 0) goto La2
                o.UST_CERT_GetPublicKeyAlgorithm r1 = o.UST_CERT_GetPublicKeyAlgorithm.this
                o.UST_CERT_GetPublicKeyAlgorithm$onExtraCallback r3 = o.UST_CERT_GetPublicKeyAlgorithm.onExtraCallbackWithResult(r1)
                java.util.Collection r3 = r3.IAuthTabCallback()
                java.lang.Object r12 = o.access15400.onNavigationEvent(r12)
                r11.L$0 = r12
                r11.label = r2
                java.lang.Object[] r9 = new java.lang.Object[]{r1, r3, r11}
                int r4 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                int r6 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                int r8 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                int r5 = im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult()
                r7 = -810500766(0xffffffffcfb0bd62, float:-5.930403E9)
                r10 = 810500769(0x304f42a1, float:7.5400847E-10)
                java.lang.Object r12 = o.UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(r4, r5, r6, r7, r8, r9, r10)
                r1 = r12
                java.lang.Object r1 = (java.lang.Object) r1
                if (r12 != r0) goto La2
                goto La5
            La2:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            La5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallbackStub.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ALCLiveness onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.IAuthTabCallbackStub.get()) {
            int i4 = access100 + 31;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        ALCLiveness aLCLivenessIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(IAuthTabCallbackDefault().IAuthTabCallback(str));
        if (aLCLivenessIAuthTabCallback != null) {
            CollectionsKt.joinToString$default(aLCLivenessIAuthTabCallback.onNavigationEvent(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        }
        return aLCLivenessIAuthTabCallback;
    }

    public ALCLiveness onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.IAuthTabCallbackStub.get()) {
            return null;
        }
        ALCLiveness aLCLivenessIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(onTransact().IAuthTabCallback(str));
        if (aLCLivenessIAuthTabCallback != null) {
            CollectionsKt.joinToString$default(aLCLivenessIAuthTabCallback.onNavigationEvent(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
            int i4 = access100 + 63;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        return aLCLivenessIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r14 != r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
    
        if (r14 == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.access13800<? super o.UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ Collection<ALCLiveness> $value;
        int label;
        final /* synthetic */ UST_CERT_GetPublicKeyAlgorithm this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(Collection<ALCLiveness> collection, UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$value = collection;
            this.this$0 = uST_CERT_GetPublicKeyAlgorithm;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback_Parcel(this.$value, this.this$0, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            String strOnNavigationEvent = getEmbedViewManager.onNavigationEvent(this.$value);
            if (strOnNavigationEvent == null) {
                strOnNavigationEvent = "[]";
            }
            return setup.onExtraCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(this.this$0), (IvParameterSpec) null, 2, (Object) null), strOnNavigationEvent, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r20, int r21, char[] r22, boolean r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithm.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super TTAppOpenAdActivity9>, Object> {
        final /* synthetic */ String $encrypted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(String str, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$encrypted = str;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super TTAppOpenAdActivity9> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return UST_CERT_GetPublicKeyAlgorithm.this.new access100(this.$encrypted, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TTHistoryActivity41 tTHistoryActivity41OnWarmupCompleted = TTCeilingLandingPageActivity5.onWarmupCompleted(UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback(UST_CERT_GetPublicKeyAlgorithm.this), false);
            String str = this.$encrypted;
            try {
                TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(tTHistoryActivity41OnWarmupCompleted);
                try {
                    TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallback = tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(str);
                    CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, (Throwable) null);
                    CloseableKt.closeFinally(tTHistoryActivity41OnWarmupCompleted, (Throwable) null);
                    return tTAppOpenAdActivity9OnExtraCallback;
                } finally {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(java.util.Collection<o.ALCLiveness> r18, o.access13800<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithm.onNavigationEvent(java.util.Collection, o.access13800):java.lang.Object");
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return UST_CERT_GetPublicKeyAlgorithm.this.new asInterface(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            TTHistoryActivity42 tTHistoryActivity42OnWarmupCompleted = TTCeilingLandingPageActivity5.onWarmupCompleted(UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback(UST_CERT_GetPublicKeyAlgorithm.this));
            try {
                TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity42OnWarmupCompleted);
                try {
                    String strOnRelationshipValidationResult = tTAppOpenAdTransActivityOnExtraCallback.onRelationshipValidationResult();
                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                    CloseableKt.closeFinally(tTHistoryActivity42OnWarmupCompleted, (Throwable) null);
                    return strOnRelationshipValidationResult;
                } finally {
                }
            } finally {
            }
        }
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super IAuthTabCallback>, Object> {
        final /* synthetic */ String $encrypted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(String str, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$encrypted = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return UST_CERT_GetPublicKeyAlgorithm.this.new IAuthTabCallbackDefault(this.$encrypted, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super IAuthTabCallback> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            String strOnWarmupCompleted = setup.onWarmupCompleted(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(UST_CERT_GetPublicKeyAlgorithm.this), (IvParameterSpec) null, 2, (Object) null), this.$encrypted, 0);
            IAuthTabCallback.C0005IAuthTabCallback c0005IAuthTabCallback = IAuthTabCallback.Companion;
            List<ALCLiveness> listEmptyList = (List) ALCEyeBlink.onExtraCallback().fromJson(strOnWarmupCompleted, new TypeToken<List<? extends ALCLiveness>>() { // from class: viva.republica.toss.core.AppBridgeRemotePolicyPoolImpl$load$2$1$1
            }.getType());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return c0005IAuthTabCallback.onWarmupCompleted(listEmptyList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r0 != r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[PHI: r3 r6
      0x002f: PHI (r3v31 o.UST_CERT_GetPublicKeyAlgorithm$asBinder) = (r3v30 o.UST_CERT_GetPublicKeyAlgorithm$asBinder), (r3v33 o.UST_CERT_GetPublicKeyAlgorithm$asBinder) binds: [B:10:0x002d, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r6v10 int) = (r6v9 int), (r6v12 int) binds: [B:10:0x002d, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(o.access13800<? super o.UST_CERT_GetPublicKeyAlgorithm.IAuthTabCallback> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetPublicKeyAlgorithm.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    static final class onExtraCallback {
        private Map<String, ALCLiveness> onNavigationEvent = access8100.onNavigationEvent();

        public final Collection<ALCLiveness> IAuthTabCallback() {
            return this.onNavigationEvent.values();
        }

        public final void IAuthTabCallback(@NotNull Collection<ALCLiveness> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            Collection<ALCLiveness> collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(collection2, 10)), 16));
            for (Object obj : collection2) {
                linkedHashMap.put(((ALCLiveness) obj).onWarmupCompleted(), obj);
            }
            this.onNavigationEvent = linkedHashMap;
        }

        public final ALCLiveness IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.onNavigationEvent.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent {
        private final LruCache<String, String> IAuthTabCallback;
        private final String onExtraCallbackWithResult;

        public onNavigationEvent(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = new LruCache<>(i);
        }

        public /* synthetic */ onNavigationEvent(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 20 : i);
        }

        private final String onExtraCallbackWithResult(String str, String str2) {
            return EstimateFaceQualityFromBGRImage.IAuthTabCallback(EstimateFaceQualityFromBGRImage.IAuthTabCallback, str + str2, false, 2, (Object) null);
        }

        public final String IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String str2 = (String) this.IAuthTabCallback.get(str);
            if (str2 != null) {
                return str2;
            }
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, this.onExtraCallbackWithResult);
            this.IAuthTabCallback.put(str, strOnExtraCallbackWithResult);
            return strOnExtraCallbackWithResult;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static final /* synthetic */ AppSetIdAndScope1 onNavigationEvent(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (AppSetIdAndScope1) onWarmupCompleted(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -873148356, iOnExtraCallbackWithResult3, new Object[]{uST_CERT_GetPublicKeyAlgorithm}, 873148357);
    }

    public static final /* synthetic */ AtomicBoolean asInterface(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (AtomicBoolean) onWarmupCompleted(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -831965141, iOnExtraCallbackWithResult3, new Object[]{uST_CERT_GetPublicKeyAlgorithm}, 831965143);
    }

    public static final /* synthetic */ Object onExtraCallback(UST_CERT_GetPublicKeyAlgorithm uST_CERT_GetPublicKeyAlgorithm, Collection collection, access13800 access13800Var) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return onWarmupCompleted(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -810500766, iOnExtraCallbackWithResult3, new Object[]{uST_CERT_GetPublicKeyAlgorithm, collection, access13800Var}, 810500769);
    }

    public final getPackageType onNavigationEvent() {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (getPackageType) onWarmupCompleted(iOnExtraCallbackWithResult, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1568581086, iOnExtraCallbackWithResult3, new Object[]{this}, 1568581086);
    }

    static void IAuthTabCallback() {
        access000 = 478309033;
    }
}
