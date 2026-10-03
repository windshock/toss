package viva.republica.toss.password.reset;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.tds.view.component.anim.text.AnimateText;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PageContext;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access;
import o.access13800;
import o.access14300;
import o.addAllCommandLine;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getErrorMSG;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.readIntokhttp;
import o.readTimeout;
import o.response;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.GuestPasswordResetViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordResetGuideFragment extends Hilt_PasswordResetGuideFragment {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackStubProxy;
    private static char[] access100;
    private static int getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private onExtraCallbackWithResult asBinder;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 1;
    private static int access000 = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private final Lazy IAuthTabCallbackDefault = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(GuestPasswordResetViewModel.class), new IAuthTabCallbackStub(this), new IAuthTabCallbackDefault(null, this), new asBinder(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.reset.PasswordResetGuideFragment$$ExternalSyntheticLambda0
        public final Object invoke() {
            return Boolean.valueOf(PasswordResetGuideFragment.onWarmupCompleted(this.f$0));
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.reset.PasswordResetGuideFragment$$ExternalSyntheticLambda1
        public final Object invoke() {
            return Long.valueOf(PasswordResetGuideFragment.onNavigationEvent(this.f$0));
        }
    });
    private final PageContext IAuthTabCallbackStub = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onWarmupCompleted);

    public interface onExtraCallbackWithResult {
        void onVerticalScrollEvent();
    }

    private static String $$c(byte b, byte b2, int i) {
        int i2 = b2 * 3;
        int i3 = 3 - (i * 2);
        byte[] bArr = $$a;
        int i4 = 105 - (b * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i3);
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i8];
            i3 = i8;
            i6 = i7;
        }
    }

    static {
        getInterfaceDescriptor = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        b(false, new byte[]{1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1}, new int[]{0, 33, 146, 14}, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(true, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1}, new int[]{33, 23, 152, 21}, objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        c(new char[]{65535, 0, 65530, 4, 4, 65526, 4, 16, 5, 4, 65526, 6, 65528, 16, 65522, 3, 5, '\t', 65526, 65525, 65530, 16}, ExpandableListView.getPackedPositionGroup(0L) + 19, true, (ViewConfiguration.getTouchSlop() >> 8) + 22, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 186, objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        c(new char[]{1, 6, 65535, 65530, 1, 6, 65532}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, false, 7 - (ViewConfiguration.getPressedStateDuration() >> 16), 211 - KeyEvent.keyCodeFromString(""), objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(true, new byte[]{1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1}, new int[]{56, 86, 118, 28}, objArr5);
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(PasswordResetGuideFragment.class, strIntern, ((String) objArr5[0]).intern(), 0)};
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        IAuthTabCallback = 8;
        int i = writeTypedObject + 111;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i5)) | i8 | (~(i6 | i5));
        int i10 = (~((~i6) | i3)) | (~(i3 | i5));
        int i11 = (~((~i5) | i7)) | i8;
        int i12 = i3 + i6 + i2 + (1821889583 * i4) + ((-349070011) * i);
        int i13 = i12 * i12;
        int i14 = (575745661 * i3) + 325058560 + (1920428227 * i6) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i2) + (473956352 * i4) + (1723858944 * i) + ((-1436549120) * i13);
        int i15 = (i3 * 921699331) + 387174459 + (i6 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i2 * 921699455) + (i4 * 347275089) + (i * 1925323067) + (i13 * 94371840);
        return i14 + ((i15 * i15) * (-174063616)) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ long onNavigationEvent(PasswordResetGuideFragment passwordResetGuideFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        long jLongValue = ((Long) onExtraCallbackWithResult(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, 857066575, iIAuthTabCallback3, new Object[]{passwordResetGuideFragment}, iIAuthTabCallback, -857066574)).longValue();
        int i4 = access000 + 11;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    public static /* synthetic */ boolean onWarmupCompleted(PasswordResetGuideFragment passwordResetGuideFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(passwordResetGuideFragment);
        }
        IAuthTabCallbackStub(passwordResetGuideFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 39;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return 1222273L;
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final /* synthetic */ getErrorMSG IAuthTabCallback(PasswordResetGuideFragment passwordResetGuideFragment) {
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getErrorMSG geterrormsgOnExtraCallback = passwordResetGuideFragment.onExtraCallback();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = access000 + 91;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return geterrormsgOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ GuestPasswordResetViewModel onExtraCallback(PasswordResetGuideFragment passwordResetGuideFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return passwordResetGuideFragment.onTransact();
        }
        passwordResetGuideFragment.onTransact();
        throw null;
    }

    public static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(PasswordResetGuideFragment passwordResetGuideFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = passwordResetGuideFragment.asBinder;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return onextracallbackwithresult;
    }

    private final GuestPasswordResetViewModel onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        GuestPasswordResetViewModel guestPasswordResetViewModel = (GuestPasswordResetViewModel) this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return guestPasswordResetViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onTransact.getValue()).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 35;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r6 = viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel + 43;
        viva.republica.toss.password.reset.PasswordResetGuideFragment.access000 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r4 = new java.lang.Object[1];
        b(true, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1}, new int[]{33, 23, 152, 21}, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        return r6.getBoolean(((java.lang.String) r4[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean IAuthTabCallbackStub(viva.republica.toss.password.reset.PasswordResetGuideFragment r6) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.reset.PasswordResetGuideFragment.access000
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r2 = 0
            android.os.Bundle r6 = r6.getArguments()
            if (r1 != 0) goto L19
            r1 = 27
            int r1 = r1 / r2
            if (r6 == 0) goto L3f
            goto L1b
        L19:
            if (r6 == 0) goto L3f
        L1b:
            r0 = 23
            byte[] r1 = new byte[r0]
            r1 = {x004a: FILL_ARRAY_DATA , data: [1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1} // fill-array
            r3 = 152(0x98, float:2.13E-43)
            r4 = 21
            r5 = 33
            int[] r0 = new int[]{r5, r0, r3, r4}
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            b(r3, r1, r0, r4)
            r0 = r4[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.getBoolean(r0)
            return r6
        L3f:
            int r6 = viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel
            int r6 = r6 + 43
            int r1 = r6 % 128
            viva.republica.toss.password.reset.PasswordResetGuideFragment.access000 = r1
            int r6 = r6 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallbackStub(viva.republica.toss.password.reset.PasswordResetGuideFragment):boolean");
    }

    private final long asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.asInterface.getValue();
        if (i3 != 0) {
            return number.longValue();
        }
        number.longValue();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        PasswordResetGuideFragment passwordResetGuideFragment = (PasswordResetGuideFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            passwordResetGuideFragment.getArguments();
            throw null;
        }
        Bundle arguments = passwordResetGuideFragment.getArguments();
        if (arguments == null) {
            return -1L;
        }
        Object[] objArr2 = new Object[1];
        c(new char[]{65535, 0, 65530, 4, 4, 65526, 4, 16, 5, 4, 65526, 6, 65528, 16, 65522, 3, 5, '\t', 65526, 65525, 65530, 16}, (Process.myTid() >> 22) + 19, true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 186 - View.resolveSizeAndState(0, 0, 0), objArr2);
        long j = arguments.getLong(((String) objArr2[0]).intern());
        int i3 = IAuthTabCallback_Parcel + 7;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return Long.valueOf(j);
        }
        int i4 = 63 / 0;
        return Long.valueOf(j);
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, getErrorMSG> {
        private static char IAuthTabCallback;
        private static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static long onNavigationEvent;
        public static final onNavigationEvent onWarmupCompleted;
        private static final byte[] $$a = {84, 79, 22, 41};
        private static final int $$b = 58;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        private static int IAuthTabCallbackStub = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, short r8) {
            /*
                byte[] r0 = viva.republica.toss.password.reset.PasswordResetGuideFragment.onNavigationEvent.$$a
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r6 = r6 * 2
                int r1 = r6 + 1
                int r8 = r8 + 109
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r8
                r3 = r2
                r8 = r7
                goto L28
            L15:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r0[r8]
            L28:
                int r4 = -r4
                int r7 = r7 + r4
                int r8 = r8 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetGuideFragment.onNavigationEvent.$$c(byte, int, short):java.lang.String");
        }

        static {
            onExtraCallback = 0;
            onNavigationEvent();
            onWarmupCompleted = new onNavigationEvent();
            int i = IAuthTabCallbackStub + 87;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        onNavigationEvent() throws Throwable {
            Object[] objArr = new Object[1];
            a((char) (48910 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.alpha(0), new char[]{48090, 24654, 31732, 2843}, new char[]{0, 0, 0, 0}, new char[]{17664, 54231, 4091, 59839}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 578741151, new char[]{59641, 44460, 5029, 55558, 60231, 18422, 19301, 1314, 7748, 58444, 28847, 35511, 48855, 153, 23890, 34137, 20045, 23298, 6771, 3072, 28982, 49475, 15315, 38624, 52522, 32324, 5855, 43095, 48325, 13241, 63486, 7044, 37690, 13620, 24730, 12352, 12341, 23213, 33849, 18096, 19036, 21401, 6916, 38502, 14902, 14697, 21435, 5813, 43816, 3325, 62378, 15017, 65367, 63332, 26904, 65335, 60124, 63935, 61282, 32297, 16059, 21534, 32653, 13200, 50889, 45668, 20372, 41787, 54836, 48080, 22093, 58989, 22020, 32016, 53454, 44649, 19996, 14606, 2372, 32039, 23657, 15535, 31586, 42942, 7965, 5810, 44753, 58855, 10568, 22432, 20042, 962, 24393, 5060, 65173, 7848, 50329, 12198, 62619}, new char[]{0, 0, 0, 0}, new char[]{40943, 32483, 56610, 31056}, objArr2);
            super(1, getErrorMSG.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 69;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            getErrorMSG geterrormsgOnNavigationEvent = onNavigationEvent((View) obj);
            int i4 = asBinder + 97;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return geterrormsgOnNavigationEvent;
        }

        public final getErrorMSG onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = asBinder + 17;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                getErrorMSG.onExtraCallback(view);
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            getErrorMSG geterrormsgOnExtraCallback = getErrorMSG.onExtraCallback(view);
            int i3 = asBinder + 39;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return geterrormsgOnExtraCallback;
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
                int i4 = $11 + 69;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 43 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1451 - TextUtils.getCapsMode("", 0, 0), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - MotionEvent.axisFromString("")), (ViewConfiguration.getEdgeSlop() >> 16) + 44, (ViewConfiguration.getTouchSlop() >> 8) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 50 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.combineMeasuredStates(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 45849), (Process.myTid() >> 22) + 29, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                int i6 = $11 + 47;
                                $10 = i6 % 128;
                                int i7 = i6 % 2;
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
            objArr[0] = new String(cArr6);
        }

        static void onNavigationEvent() {
            onNavigationEvent = 7798559133331975163L;
            onExtraCallbackWithResult = -1776194565;
            IAuthTabCallback = (char) 62890;
        }
    }

    private final getErrorMSG onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult(this, onWarmupCompleted[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        getErrorMSG geterrormsg = (getErrorMSG) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i4 = access000 + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return geterrormsg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_password_reset_guide_varient, viewGroup, false);
        int i4 = IAuthTabCallback_Parcel + 19;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return viewInflate;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onExtraCallbackWithResult(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, 56087469, iIAuthTabCallback3, new Object[]{this}, iIAuthTabCallback, -56087469);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
        int i2 = access000 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int[] onNavigationEvent = {-1611335034, -1535499027, -1466799395, 1740594138, 1634339999, 1231165520, 1085547330, -1655531759, 1401691336, 1875698355, -1629240947, 119351164, 17293442, -530635679, 348731395, -67650864, 415809583, 46307652};
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = PasswordResetGuideFragment.this.new IAuthTabCallback(access13800Var);
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                PasswordResetGuideFragment.onExtraCallback(PasswordResetGuideFragment.this).onExtraCallbackWithResult(true);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(2500L, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallback + 111;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(new int[]{1039239459, 1597351092, -946582542, 1989185199, 1441583147, 1372369167, -1717570464, -2001659894, 1752722728, -1070039600, -1850317574, -499984425, 1778523422, 2072932906, -1772386557, -1541304041, -1441812167, 1894241689, -1317517035, -235520702, 478976902, 1117425192, 257101743, -178947263}, 47 - TextUtils.indexOf("", ""), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            onExtraCallbackWithResult onExtraCallbackWithResult = PasswordResetGuideFragment.onExtraCallbackWithResult(PasswordResetGuideFragment.this);
            if (onExtraCallbackWithResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                onExtraCallbackWithResult = null;
            }
            onExtraCallbackWithResult.onVerticalScrollEvent();
            ConstraintLayout root = PasswordResetGuideFragment.IAuthTabCallback(PasswordResetGuideFragment.this).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(8);
            PasswordResetGuideFragment.onExtraCallback(PasswordResetGuideFragment.this).onExtraCallbackWithResult(false);
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 15;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 82 / 0;
            }
            return unit;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onNavigationEvent;
            char c = '0';
            int i3 = -1469660336;
            int i4 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 71 - TextUtils.lastIndexOf("", c), 8848 - (KeyEvent.getMaxKeyCode() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i5++;
                        c = '0';
                        i3 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onNavigationEvent;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i6 = 0;
                while (i6 < length3) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i6]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(i4), 72 - KeyEvent.normalizeMetaState(i4), 8848 - (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                    i4 = 0;
                }
                iArr5 = iArr6;
            }
            int i7 = i4;
            System.arraycopy(iArr5, i7, iArr4, i7, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i7;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i7] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i8 = $10 + 43;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 0;
                while (i10 < 16) {
                    int i11 = $10 + 109;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.argb(0, 0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 40, 10300 - ExpandableListView.getPackedPositionChild(0L), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i10 += 119;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.getMode(0)), TextUtils.indexOf("", "", 0) + 39, 10301 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i10++;
                    }
                }
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 4033), Color.blue(0) + 78, 7398 - TextUtils.indexOf("", ""), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i7 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i15 = $10 + 93;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            objArr[0] = str;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PasswordResetGuideFragment passwordResetGuideFragment = (PasswordResetGuideFragment) objArr[0];
        int i = 2 % 2;
        AnimateText animateText = passwordResetGuideFragment.onExtraCallback().onNavigationEvent;
        animateText.setTypography(3);
        animateText.setFont(response.Bold);
        Intrinsics.checkNotNull(animateText);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateText.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onRelationshipValidationResult());
        Context context2 = passwordResetGuideFragment.onExtraCallback().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        AnimateText.onExtraCallback(animateText, passwordResetGuideFragment.onWarmupCompleted(context2), readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
        int i2 = access000 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getScreenParams() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetGuideFragment.getScreenParams():java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r4 = r4.getString(viva.republica.toss.R.string.app_password_reset_guide_title, o.PlayerErrorCode.onPostMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r1 = viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel + 83;
        viva.republica.toss.password.reset.PasswordResetGuideFragment.access000 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (onTransact().onExtraCallbackWithResult() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (onTransact().onExtraCallbackWithResult() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r4 = r4.getString(viva.republica.toss.R.string.app_password_reset_guide_title_from_login, o.PlayerErrorCode.onPostMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String onWarmupCompleted(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel
            int r1 = r1 + 3
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetGuideFragment.access000 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            viva.republica.toss.guest.GuestPasswordResetViewModel r1 = r3.onTransact()
            boolean r1 = r1.onExtraCallbackWithResult()
            r2 = 84
            int r2 = r2 / 0
            if (r1 == 0) goto L39
            goto L27
        L1d:
            viva.republica.toss.guest.GuestPasswordResetViewModel r1 = r3.onTransact()
            boolean r1 = r1.onExtraCallbackWithResult()
            if (r1 == 0) goto L39
        L27:
            int r0 = viva.republica.toss.R.string.app_password_reset_guide_title_from_login
            java.lang.String r1 = o.PlayerErrorCode.onPostMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = r4.getString(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            return r4
        L39:
            int r1 = viva.republica.toss.R.string.app_password_reset_guide_title
            java.lang.String r2 = o.PlayerErrorCode.onPostMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = r4.getString(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r1 = viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel
            int r1 = r1 + 83
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetGuideFragment.access000 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L56
            return r4
        L56:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetGuideFragment.onWarmupCompleted(android.content.Context):java.lang.String");
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static char[] onNavigationEvent = {27236, 27165, 27143, 27166, 27162, 27136, 27159, 27156, 27167, 27143, 27146, 27141, 27158, 27164, 27140, 27164, 27165, 27165, 27138, 27147, 27143, 27143, 27136, 27183, 27275, 27293, 27291, 27267, 27269, 27267, 27292, 27269, 27269, 27286, 27286, 27292, 27269, 27266, 27267, 27292, 27265, 27270, 27292, 27291, 27267};
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final PasswordResetGuideFragment IAuthTabCallback(boolean z, long j) throws Throwable {
            int i = 2 % 2;
            PasswordResetGuideFragment passwordResetGuideFragment = new PasswordResetGuideFragment();
            Bundle bundle = new Bundle();
            Object[] objArr = new Object[1];
            a(new int[]{0, 23, 0, 21}, false, new byte[]{0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1}, objArr);
            bundle.putBoolean(((String) objArr[0]).intern(), z);
            Object[] objArr2 = new Object[1];
            a(new int[]{23, 22, 127, 0}, true, new byte[]{1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1}, objArr2);
            bundle.putLong(((String) objArr2[0]).intern(), j);
            passwordResetGuideFragment.setArguments(bundle);
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return passwordResetGuideFragment;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onNavigationEvent;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.resolveSize(0, 0)), 36 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i7 = $11 + 41;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 10935), Color.green(0) + 65, 16718 - View.MeasureSpec.makeMeasureSpec(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 28, 17657 - TextUtils.getTrimmedLength(""), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49467), Drawable.resolveOpacity(0, 0) + 70, ((Process.getThreadPriority(0) + 20) >> 6) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                int i11 = $10 + 55;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 3 % 2;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i13 = $10 + 87;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    char[] cArr5 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr5, 1, i3);
                    System.arraycopy(cArr5, 0, cArr3, i3 / i5, i5);
                    System.arraycopy(cArr5, i5, cArr3, 1, i3 * i5);
                } else {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr6, 0, i3);
                    int i14 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr3, i14, i5);
                    System.arraycopy(cArr6, i5, cArr3, 0, i14);
                }
            }
            if (!(!z)) {
                char[] cArr7 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr7;
            }
            if (i4 > 0) {
                int i15 = $10 + 67;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(char[] r20, int r21, boolean r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetGuideFragment.c(char[], int, boolean, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // viva.republica.toss.password.reset.Hilt_PasswordResetGuideFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttach(@org.jetbrains.annotations.NotNull android.content.Context r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.reset.PasswordResetGuideFragment.access000
            int r1 = r1 + 21
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            super.onAttach(r11)
            boolean r1 = r11 instanceof viva.republica.toss.password.reset.PasswordResetGuideFragment.onExtraCallbackWithResult
            r4 = 45
            int r4 = r4 / r3
            if (r1 != 0) goto Lab
            goto L29
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            super.onAttach(r11)
            boolean r1 = r11 instanceof viva.republica.toss.password.reset.PasswordResetGuideFragment.onExtraCallbackWithResult
            if (r1 != 0) goto Lab
        L29:
            androidx.fragment.app.Fragment r11 = r10.getParentFragment()
            boolean r11 = r11 instanceof viva.republica.toss.password.reset.PasswordResetGuideFragment.onExtraCallbackWithResult
            r1 = 1
            if (r11 == 0) goto L89
            int r11 = viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel
            int r11 = r11 + 125
            int r4 = r11 % 128
            viva.republica.toss.password.reset.PasswordResetGuideFragment.access000 = r4
            int r11 = r11 % r0
            androidx.fragment.app.Fragment r11 = r10.getParentFragment()
            if (r11 == 0) goto L55
            int r1 = viva.republica.toss.password.reset.PasswordResetGuideFragment.IAuthTabCallback_Parcel
            int r1 = r1 + 17
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetGuideFragment.access000 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L52
            viva.republica.toss.password.reset.PasswordResetGuideFragment$onExtraCallbackWithResult r11 = (viva.republica.toss.password.reset.PasswordResetGuideFragment.onExtraCallbackWithResult) r11
            r0 = 48
            int r0 = r0 / r3
            goto Lab
        L52:
            viva.republica.toss.password.reset.PasswordResetGuideFragment$onExtraCallbackWithResult r11 = (viva.republica.toss.password.reset.PasswordResetGuideFragment.onExtraCallbackWithResult) r11
            goto Lab
        L55:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r0 = 107(0x6b, float:1.5E-43)
            char[] r4 = new char[r0]
            r4 = {x00b0: FILL_ARRAY_DATA , data: [-65, 2, 0, 13, 13, 14, 19, -65, 1, 4, -65, 2, 0, 18, 19, -65, 19, 14, -65, 13, 14, 13, -52, 13, 20, 11, 11, -65, 19, 24, 15, 4, -65, 21, 8, 21, 0, -51, 17, 4, 15, 20, 1, 11, 8, 2, 0, -51, 19, 14, 18, 18, -51, 15, 0, 18, 18, 22, 14, 17, 3, -51, 17, 4, 18, 4, 19, -51, -17, 0, 18, 18, 22, 14, 17, 3, -15, 4, 18, 4, 19, -26, 20, 8, 3, 4, -27, 17, 0, 6, 12, 4, 13, 19, -51, -30, 0, 11, 11, 1, 0, 2, 10, 13, 20, 11, 11} // fill-array
            int r0 = android.view.ViewConfiguration.getPressedStateDuration()
            int r0 = r0 >> 16
            int r5 = 103 - r0
            r6 = 0
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r2, r0, r3)
            int r7 = 106 - r0
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            int r8 = r0 + 204
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r9 = r0
            c(r4, r5, r6, r7, r8, r9)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r11.<init>(r0)
            throw r11
        L89:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r0 = 56
            byte[] r2 = new byte[r0]
            r2 = {x0120: FILL_ARRAY_DATA , data: [0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0} // fill-array
            r4 = 179(0xb3, float:2.51E-43)
            r5 = 115(0x73, float:1.61E-43)
            int[] r0 = new int[]{r4, r0, r5, r3}
            java.lang.Object[] r1 = new java.lang.Object[r1]
            b(r3, r2, r0, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r11.<init>(r0)
            throw r11
        Lab:
            viva.republica.toss.password.reset.PasswordResetGuideFragment$onExtraCallbackWithResult r11 = (viva.republica.toss.password.reset.PasswordResetGuideFragment.onExtraCallbackWithResult) r11
            r10.asBinder = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetGuideFragment.onAttach(android.content.Context):void");
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class asBinder extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = access100;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 43;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c, 0) + 35284), KeyEvent.keyCodeFromString("") + 35, (Process.myPid() >> 22) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                    c = '0';
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 55;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 65 - ((Process.getThreadPriority(0) + 20) >> 6), 16718 - Color.alpha(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf("", "", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - ImageFormat.getBitsPerPixel(0)), 70 - (ViewConfiguration.getJumpTapTimeout() >> 16), 12486 - View.MeasureSpec.getSize(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i13, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i14 = $11 + 37;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static final long asBinder(PasswordResetGuideFragment passwordResetGuideFragment) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Long) onExtraCallbackWithResult(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, 857066575, iIAuthTabCallback3, new Object[]{passwordResetGuideFragment}, iIAuthTabCallback, -857066574)).longValue();
    }

    private final void IAuthTabCallbackDefault() {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        onExtraCallbackWithResult(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, 56087469, iIAuthTabCallback3, new Object[]{this}, iIAuthTabCallback, -56087469);
    }

    static void IAuthTabCallback() {
        access100 = new char[]{27191, 27317, 27313, 27319, 27317, 27469, 27297, 27296, 27317, 27320, 27314, 27317, 27317, 27469, 27322, 27300, 27314, 27467, 27465, 27467, 27468, 27315, 27299, 27299, 27312, 27312, 27312, 27297, 27326, 27471, 27318, 27320, 27297, 27168, 27306, 27301, 27301, 27300, 27308, 27300, 27326, 27309, 27282, 27311, 27303, 27324, 27327, 27304, 27298, 27302, 27311, 27301, 27296, 27304, 27311, 27311, 27164, 27376, 27286, 27282, 27310, 27283, 27311, 27302, 27310, 27311, 27272, 27376, 27311, 27307, 27307, 27289, 27390, 27344, 27379, 27310, 27311, 27282, 27281, 27311, 27269, 27295, 27308, 27282, 27273, 27273, 27310, 27311, 27282, 27281, 27311, 27269, 27295, 27305, 27281, 27283, 27309, 27281, 27295, 27293, 27284, 27282, 27307, 27290, 27293, 27308, 27308, 27308, 27295, 27295, 27311, 27304, 27303, 27301, 27303, 27310, 27264, 27286, 27305, 27281, 27281, 27310, 27284, 27281, 27292, 27390, 27279, 27310, 27311, 27282, 27281, 27311, 27285, 27289, 27310, 27310, 27286, 27377, 27273, 27303, 27305, 27305, 27151, 27340, 27339, 27337, 27337, 27331, 27336, 27342, 27181, 27271, 27267, 27293, 27269, 27271, 27288, 27290, 27268, 27273, 27269, 27234, 27241, 27261, 27168, 27171, 27170, 27197, 27175, 27175, 27170, 27170, 27197, 27168, 27170, 27168, 27176, 27178, 27176, 27182, 27290, 27305, 27304, 27379, 27385, 27280, 27311, 27311, 27285, 27282, 27282, 27282, 27306, 27379, 27386, 27291, 27287, 27281, 27284, 27290, 27291, 27284, 27382, 27384, 27281, 27309, 27311, 27383, 27381, 27285, 27282, 27280, 27282, 27306, 27379, 27373, 27275, 27280, 27311, 27308, 27308, 27311, 27303, 27377, 27380, 27309, 27378, 27368, 27265, 27282, 27289, 27283, 27282, 27282, 27306};
        IAuthTabCallbackStubProxy = 478308930;
    }
}
