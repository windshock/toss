package im.toss.rn.toss.core.bundle.source;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.rn.spec.log.ReactLogKt;
import im.toss.rn.toss.core.bundle.model.BundleMetadata;
import im.toss.rn.toss.core.bundle.source.BuiltInBundleSourceImpl;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AUTextView;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.MaxAdViewImplExternalSyntheticLambda4;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.TimelineExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access8100;
import o.adInfo;
import o.dbExternalSyntheticLambda0;
import o.dc;
import o.findResAndMsg;
import o.getWriggleLayout;
import o.getWrite;
import o.htf31;
import o.liq;
import o.maybeUpdateAnimatable;
import o.okycx;
import o.putChannelInfo;
import o.r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0;
import o.setRequestListener;
import o.videoFrameChanged;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class BuiltInBundleSourceImpl implements r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 {
    public static final onExtraCallback Companion;
    private static char[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static long onExtraCallback;
    private final dc onNavigationEvent;
    private final Context onWarmupCompleted;
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2 = (b * 4) + 97;
        int i3 = 4 - (s * 2);
        byte[] bArr = $$a;
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i2 += i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i5 = i3;
            i3 = bArr[i3];
            i2 += i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        Companion = new onExtraCallback(null);
        int i = onExtraCallbackWithResult + 91;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public BuiltInBundleSourceImpl(@NotNull Context context, @NotNull dc dcVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dcVar, "");
        this.onWarmupCompleted = context;
        this.onNavigationEvent = dcVar;
    }

    public static final /* synthetic */ BundleMetadata IAuthTabCallback(BuiltInBundleSourceImpl builtInBundleSourceImpl, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BundleMetadata bundleMetadataOnExtraCallback = builtInBundleSourceImpl.onExtraCallback(str);
        int i4 = onTransact + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return bundleMetadataOnExtraCallback;
    }

    public static final /* synthetic */ void onExtraCallback(BuiltInBundleSourceImpl builtInBundleSourceImpl, String str, String str2, BundleMetadata bundleMetadata, String str3, String str4) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        builtInBundleSourceImpl.onExtraCallback(str, str2, bundleMetadata, str3, str4);
        int i4 = onTransact + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Context onWarmupCompleted(BuiltInBundleSourceImpl builtInBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Context context = builtInBundleSourceImpl.onWarmupCompleted;
        if (i4 != 0) {
            int i5 = 19 / 0;
        }
        int i6 = i2 + 73;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return context;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setRequestListener>, Object> {
        final /* synthetic */ String $bundleName;
        final /* synthetic */ String $company;
        final /* synthetic */ Date $minDeployedAt;
        final /* synthetic */ String $region;
        int label;
        final /* synthetic */ BuiltInBundleSourceImpl this$0;
        private static final byte[] $$a = {113, 66, 51, 67};
        private static final int $$b = 161;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onNavigationEvent = 7798559133331975163L;
        private static int IAuthTabCallback = -1776194565;
        private static char onExtraCallback = 28126;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i, int i2) {
            int i3;
            int i4;
            int i5 = i * 4;
            byte[] bArr = $$a;
            int i6 = i2 + 109;
            int i7 = 4 - (b * 3);
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i8 = i7;
                i6 = i5;
                i3 = 0;
                int i9 = i7;
                i6 += i8;
                i4 = i9 + 1;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                i3++;
                i8 = bArr[i4];
                i9 = i4;
                i6 += i8;
                i4 = i9 + 1;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                }
            } else {
                i3 = 0;
                i4 = i7;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, String str2, String str3, BuiltInBundleSourceImpl builtInBundleSourceImpl, Date date, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$region = str;
            this.$company = str2;
            this.$bundleName = str3;
            this.this$0 = builtInBundleSourceImpl;
            this.$minDeployedAt = date;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$region, this.$company, this.$bundleName, this.this$0, this.$minDeployedAt, access13800Var);
            int i2 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super setRequestListener> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0253  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4;
            BundleMetadata bundleMetadata;
            String str;
            String strOnNavigationEvent;
            String str2;
            String str3;
            Long lOnExtraCallback;
            String strOnTransact;
            String strOnNavigationEvent2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4OnNavigationEvent = MaxAdViewImplExternalSyntheticLambda4.Companion.onNavigationEvent(this.$region, this.$company, this.$bundleName);
            String strOnWarmupCompleted = maxAdViewImplExternalSyntheticLambda4OnNavigationEvent.onWarmupCompleted();
            String strIAuthTabCallback = maxAdViewImplExternalSyntheticLambda4OnNavigationEvent.IAuthTabCallback();
            InputStream inputStreamOpen = BuiltInBundleSourceImpl.onWarmupCompleted(this.this$0).getAssets().open(strOnWarmupCompleted);
            try {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                BundleMetadata bundleMetadataIAuthTabCallback = BuiltInBundleSourceImpl.IAuthTabCallback(this.this$0, strIAuthTabCallback);
                Date date = this.$minDeployedAt;
                if (date != null) {
                    int i3 = onWarmupCompleted + 65;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (bundleMetadataIAuthTabCallback == null) {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl");
                        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundleName", this.$bundleName);
                        Object[] objArr = new Object[1];
                        a((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30275), (-1) - TextUtils.lastIndexOf("", '0', 0), new char[]{19327, 23649, 35363, 17985, 12958, 34356}, new char[]{0, 0, 0, 0}, new char[]{53441, 22246, 17577, 20342}, objArr);
                        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "react_native_debug", "min_deployed_at_rejected_builtin", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "metadata_not_found"), getWrite.IAuthTabCallback("minDeployedAt", this.$minDeployedAt.toString())}), 4, (Object) null);
                        throw new IllegalStateException("Built-in bundle " + this.$bundleName + " does not have metadata for minDeployedAt requirement: required=" + this.$minDeployedAt);
                    }
                }
                if (date != null) {
                    int i4 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (bundleMetadataIAuthTabCallback != null) {
                        Date dateOnExtraCallback = bundleMetadataIAuthTabCallback.onExtraCallback();
                        boolean z = dateOnExtraCallback.compareTo(this.$minDeployedAt) < 0;
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        str = "";
                        maxAdViewImplExternalSyntheticLambda4 = maxAdViewImplExternalSyntheticLambda4OnNavigationEvent;
                        bundleMetadata = bundleMetadataIAuthTabCallback;
                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "react_native_debug", "min_deployed_at_verification_builtin", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl"), getWrite.IAuthTabCallback("bundleName", this.$bundleName), getWrite.IAuthTabCallback("bundleDeployedAt", dateOnExtraCallback.toString()), getWrite.IAuthTabCallback("minDeployedAt", this.$minDeployedAt.toString()), getWrite.IAuthTabCallback("willReject", access14000.onNavigationEvent(z))}), (String) null, false, (String) null, 56, (Object) null);
                        if (z) {
                            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray2, "react_native_debug", "min_deployed_at_rejected_builtin", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl"), getWrite.IAuthTabCallback("bundleName", this.$bundleName), getWrite.IAuthTabCallback("bundleDeployedAt", dateOnExtraCallback.toString()), getWrite.IAuthTabCallback("minDeployedAt", this.$minDeployedAt.toString())}), 4, (Object) null);
                            throw new IllegalStateException("Built-in bundle " + this.$bundleName + " does not meet minDeployedAt requirement: bundle=" + dateOnExtraCallback + ", required=" + this.$minDeployedAt);
                        }
                    } else {
                        maxAdViewImplExternalSyntheticLambda4 = maxAdViewImplExternalSyntheticLambda4OnNavigationEvent;
                        bundleMetadata = bundleMetadataIAuthTabCallback;
                        str = "";
                    }
                }
                BuiltInBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, strOnWarmupCompleted, bundleMetadata, this.$region, this.$company);
                String str4 = this.$bundleName;
                if (bundleMetadata == null || (strOnNavigationEvent = bundleMetadata.onNavigationEvent()) == null) {
                    strOnNavigationEvent = str;
                }
                ReactLogKt.IAuthTabCallback(str4, strOnNavigationEvent);
                String str5 = this.$bundleName;
                String strOnExtraCallback = maxAdViewImplExternalSyntheticLambda4.onExtraCallback();
                if (bundleMetadata != null) {
                    int i6 = onWarmupCompleted + 29;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    String strIAuthTabCallbackStub = bundleMetadata.IAuthTabCallbackStub();
                    str2 = strIAuthTabCallbackStub == null ? str : strIAuthTabCallbackStub;
                }
                String str6 = (bundleMetadata == null || (strOnNavigationEvent2 = bundleMetadata.onNavigationEvent()) == null) ? str : strOnNavigationEvent2;
                if (bundleMetadata != null) {
                    String str7 = (String) BundleMetadata.onExtraCallback(2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{bundleMetadata});
                    str3 = str7 == null ? str : str7;
                }
                String str8 = (bundleMetadata == null || (strOnTransact = bundleMetadata.onTransact()) == null) ? str : strOnTransact;
                if (bundleMetadata != null) {
                    int i8 = onWarmupCompleted + 83;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        access14000.onExtraCallback(bundleMetadata.asBinder());
                        throw null;
                    }
                    lOnExtraCallback = access14000.onExtraCallback(bundleMetadata.asBinder());
                } else {
                    lOnExtraCallback = null;
                }
                return new setRequestListener(str5, strOnExtraCallback, str2, str6, str3, str8, lOnExtraCallback, access14000.onExtraCallback(bundleMetadata != null ? bundleMetadata.IAuthTabCallbackDefault() : System.currentTimeMillis()), true);
            } finally {
            }
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
            int i4 = $11 + 73;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i6 = $10 + 33;
                $11 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), MotionEvent.axisFromString("") + 44, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 44 - (ViewConfiguration.getTapTimeout() >> 16), 1495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getPressedStateDuration() >> 16)), View.MeasureSpec.getMode(0) + 50, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 45848), 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12576 - TextUtils.lastIndexOf("", '0', 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
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
    }

    @Override // o.r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0
    public Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Date date, @NotNull access13800<? super setRequestListener> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(str2, str3, str, this, date, null), access13800Var);
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        char c2;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            c2 = 3;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "", 0)), TextUtils.indexOf("", "") + 17, TextUtils.getOffsetAfter("", 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getLongPressTimeout() >> 16)), 31 - ((Process.getThreadPriority(0) + 20) >> 6), Drawable.resolveOpacity(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char cAlpha = (char) (49123 - Color.alpha(0));
                    int iArgb = Color.argb(0, 0, 0, 0) + 44;
                    int iNormalizeMetaState = 1494 - KeyEvent.normalizeMetaState(0);
                    byte b = (byte) ($$a[3] + 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, iArgb, iNormalizeMetaState, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $10 + 47;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i8 = $11 + 75;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback4 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49123);
                        int size = 44 - View.MeasureSpec.getSize(0);
                        int i9 = 1495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        byte b3 = (byte) ($$a[c2] + 1);
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, size, i9, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i10 = 10 / 0;
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
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback5 == null) {
                    char gidForName = (char) (49122 - Process.getGidForName(""));
                    int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                    int gidForName2 = 1493 - Process.getGidForName("");
                    byte b5 = (byte) ($$a[3] + 1);
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, i11, gidForName2, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            i3 = -1401950695;
            c2 = 3;
        }
        objArr[0] = new String(cArr);
    }

    private final void onExtraCallback(String str, String str2, BundleMetadata bundleMetadata, String str3, String str4) throws Throwable {
        String strIAuthTabCallbackStub;
        String strOnNavigationEvent;
        int i = 2 % 2;
        if (bundleMetadata != null) {
            int i2 = onTransact + 109;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            strIAuthTabCallbackStub = bundleMetadata.IAuthTabCallbackStub();
        } else {
            strIAuthTabCallbackStub = null;
        }
        String str5 = "";
        if (strIAuthTabCallbackStub == null || strIAuthTabCallbackStub.length() == 0) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl");
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundleName", str);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("region", str3);
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("company", str4);
            Object[] objArr = new Object[1];
            a(TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 7, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "builtin_signature_verification_skipped", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "no_signature")}), (String) null, false, (String) null, 56, (Object) null);
            int i4 = onTransact + 79;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = onTransact + 1;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        try {
            PublicKey publicKeyIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(str3, str4);
            InputStream inputStreamOpen = this.onWarmupCompleted.getAssets().open(str2);
            try {
                Intrinsics.checkNotNull(inputStreamOpen);
                TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.IAuthTabCallback(inputStreamOpen));
                try {
                    boolean zIAuthTabCallback = dbExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(tTAppOpenAdTransActivityOnExtraCallback, strIAuthTabCallbackStub, publicKeyIAuthTabCallback);
                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                    CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                    if (zIAuthTabCallback) {
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "builtin_signature_verified", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", str3), getWrite.IAuthTabCallback("company", str4)}), (String) null, false, (String) null, 56, (Object) null);
                        return;
                    }
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl");
                    Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("bundleName", str);
                    Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("region", str3);
                    Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("company", str4);
                    if (bundleMetadata != null && (strOnNavigationEvent = bundleMetadata.onNavigationEvent()) != null) {
                        str5 = strOnNavigationEvent;
                    }
                    ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray2, "react_native_debug", "builtin_signature_verification_failed", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, getWrite.IAuthTabCallback("deploymentId", str5)}), 4, (Object) null);
                    throw new SecurityException("Built-in bundle " + str + " signature verification failed for region=" + str3 + " company=" + str4);
                } finally {
                }
            } finally {
            }
        } catch (IllegalArgumentException unused) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl");
            Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback("bundleName", str);
            Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback("region", str3);
            Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback("company", str4);
            Object[] objArr2 = new Object[1];
            a(TextUtils.getTrimmedLength(""), 6 - ExpandableListView.getPackedPositionGroup(0L), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, "react_native_debug", "builtin_signature_verification_skipped", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), "no_key")}), (String) null, false, (String) null, 56, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final BundleMetadata onExtraCallback(String str) {
        Object obj;
        Throwable th;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            InputStream inputStreamOpen = this.onWarmupCompleted.getAssets().open(str);
            try {
                Intrinsics.checkNotNull(inputStreamOpen);
                TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.IAuthTabCallback(inputStreamOpen));
                try {
                    BundleMetadata bundleMetadataOnWarmupCompleted = BuiltInBundleMetadata.Companion.onExtraCallbackWithResult(tTAppOpenAdTransActivityOnExtraCallback).onWarmupCompleted();
                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                    CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                    obj = Result.constructor-impl(bundleMetadataOnWarmupCompleted);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
            }
            if (Result.onExtraCallback(obj)) {
            }
            BundleMetadata bundleMetadata = (BundleMetadata) obj2;
            int i4 = onTransact + 1;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return bundleMetadata;
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "builtin_metadata_not_found", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "BuiltInBundleSourceImpl"), getWrite.IAuthTabCallback("metaAssetPath", str), getWrite.IAuthTabCallback("error", th.getMessage())}), (String) null, false, (String) null, 56, (Object) null);
        }
        if (Result.onExtraCallback(obj)) {
            obj2 = obj;
        } else {
            int i6 = IAuthTabCallbackStub + 81;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 16 / 0;
            }
        }
        BundleMetadata bundleMetadata2 = (BundleMetadata) obj2;
        int i42 = onTransact + 1;
        IAuthTabCallbackStub = i42 % 128;
        int i52 = i42 % 2;
        return bundleMetadata2;
    }

    @liq
    static final class BuiltInBundleMetadata {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String deployedAt;
        private final String deploymentId;
        private final String reactNativeVersion;
        private final long savedAt;
        private final String sharedMinDeployedAt;
        private final String signature;
        private final long updatedAt;
        public static final Companion Companion = new Companion(null);
        private static final wie2 json = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.bundle.source.BuiltInBundleSourceImpl$BuiltInBundleMetadata$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = BuiltInBundleSourceImpl.BuiltInBundleMetadata.onWarmupCompleted((adInfo) obj);
                if (i3 != 0) {
                    int i4 = 61 / 0;
                }
                int i5 = onWarmupCompleted + 49;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1, (Object) null);

        public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adinfo);
            int i4 = onWarmupCompleted + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 113;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof BuiltInBundleMetadata)) {
                int i3 = IAuthTabCallback + 97;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                boolean z = i3 % 2 == 0;
                int i5 = i4 + 43;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return z;
                }
                throw null;
            }
            BuiltInBundleMetadata builtInBundleMetadata = (BuiltInBundleMetadata) obj;
            if (!Intrinsics.areEqual(this.signature, builtInBundleMetadata.signature)) {
                int i6 = onWarmupCompleted + 109;
                IAuthTabCallback = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.deploymentId, builtInBundleMetadata.deploymentId) || !Intrinsics.areEqual(this.deployedAt, builtInBundleMetadata.deployedAt) || !Intrinsics.areEqual(this.sharedMinDeployedAt, builtInBundleMetadata.sharedMinDeployedAt) || this.savedAt != builtInBundleMetadata.savedAt || this.updatedAt != builtInBundleMetadata.updatedAt) {
                return false;
            }
            if (Intrinsics.areEqual(this.reactNativeVersion, builtInBundleMetadata.reactNativeVersion)) {
                return true;
            }
            int i7 = IAuthTabCallback + 67;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.signature.hashCode();
            int iHashCode3 = this.deploymentId.hashCode();
            int iHashCode4 = this.deployedAt.hashCode();
            int iHashCode5 = this.sharedMinDeployedAt.hashCode();
            int iHashCode6 = Long.hashCode(this.savedAt);
            int iHashCode7 = Long.hashCode(this.updatedAt);
            String str = this.reactNativeVersion;
            if (str == null) {
                int i4 = IAuthTabCallback + 49;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i6 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
            int i7 = IAuthTabCallback + 39;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 26 / 0;
            }
            return i6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BuiltInBundleMetadata(signature=" + this.signature + ", deploymentId=" + this.deploymentId + ", deployedAt=" + this.deployedAt + ", sharedMinDeployedAt=" + this.sharedMinDeployedAt + ", savedAt=" + this.savedAt + ", updatedAt=" + this.updatedAt + ", reactNativeVersion=" + this.reactNativeVersion + ")";
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public /* synthetic */ BuiltInBundleMetadata(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, okycx okycxVar) {
            if (7 != (i & 7)) {
                htf31.onExtraCallbackWithResult(i, 7, BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer.INSTANCE.getDescriptor());
            }
            this.signature = str;
            this.deploymentId = str2;
            this.deployedAt = str3;
            if ((i & 8) == 0) {
                this.sharedMinDeployedAt = "";
            } else {
                this.sharedMinDeployedAt = str4;
            }
            int i2 = 2 % 2;
            if ((i & 16) == 0) {
                int i3 = onWarmupCompleted + 25;
                IAuthTabCallback = i3 % 128;
                this.savedAt = i3 % 2 != 0 ? 1L : 0L;
            } else {
                this.savedAt = j;
            }
            if ((i & 32) == 0) {
                this.updatedAt = this.savedAt;
            } else {
                this.updatedAt = j2;
                int i4 = onWarmupCompleted + 69;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            if ((i & 64) != 0) {
                this.reactNativeVersion = str5;
                return;
            }
            int i6 = IAuthTabCallback + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            this.reactNativeVersion = null;
            if (i7 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ wie2 IAuthTabCallback() {
            wie2 wie2Var;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                wie2Var = json;
                int i4 = 20 / 0;
            } else {
                wie2Var = json;
            }
            int i5 = i3 + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return wie2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(BuiltInBundleMetadata builtInBundleMetadata, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, builtInBundleMetadata.signature);
            vylVar.onExtraCallback(serialDescriptor, 1, builtInBundleMetadata.deploymentId);
            vylVar.onExtraCallback(serialDescriptor, 2, builtInBundleMetadata.deployedAt);
            Object obj = null;
            if (vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                vylVar.onExtraCallback(serialDescriptor, 3, builtInBundleMetadata.sharedMinDeployedAt);
            } else {
                int i2 = onWarmupCompleted + 39;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.areEqual(builtInBundleMetadata.sharedMinDeployedAt, "");
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(builtInBundleMetadata.sharedMinDeployedAt, "")) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || builtInBundleMetadata.savedAt != 0) {
                vylVar.onExtraCallback(serialDescriptor, 4, builtInBundleMetadata.savedAt);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || builtInBundleMetadata.updatedAt != builtInBundleMetadata.savedAt) {
                vylVar.onExtraCallback(serialDescriptor, 5, builtInBundleMetadata.updatedAt);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                int i3 = IAuthTabCallback + 67;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    String str = builtInBundleMetadata.reactNativeVersion;
                    obj.hashCode();
                    throw null;
                }
                if (builtInBundleMetadata.reactNativeVersion == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, builtInBundleMetadata.reactNativeVersion);
        }

        public final BundleMetadata onWarmupCompleted() {
            int i = 2 % 2;
            BundleMetadata bundleMetadata = new BundleMetadata(this.signature, this.deploymentId, this.deployedAt, this.sharedMinDeployedAt, this.savedAt, this.updatedAt, this.reactNativeVersion);
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
            return bundleMetadata;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BuiltInBundleMetadata> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer builtInBundleSourceImpl$BuiltInBundleMetadata$$serializer = BuiltInBundleSourceImpl$BuiltInBundleMetadata$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 11;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return builtInBundleSourceImpl$BuiltInBundleMetadata$$serializer;
            }

            public final BuiltInBundleMetadata onExtraCallbackWithResult(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
                wie2 wie2VarIAuthTabCallback = BuiltInBundleMetadata.IAuthTabCallback();
                String strOnRelationshipValidationResult = tTAppOpenAdTransActivity.onRelationshipValidationResult();
                wie2VarIAuthTabCallback.onExtraCallback();
                BuiltInBundleMetadata builtInBundleMetadata = (BuiltInBundleMetadata) wie2VarIAuthTabCallback.onExtraCallback(BuiltInBundleMetadata.Companion.serializer(), strOnRelationshipValidationResult);
                int i4 = onNavigationEvent + 119;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return builtInBundleMetadata;
            }
        }

        static {
            int i = onNavigationEvent + 31;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(true);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
            adinfo.onExtraCallbackWithResult(true);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return unit;
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{60838, 53093, 43037, 34267, 26347, 17310};
        onExtraCallback = -2199831202628382976L;
    }
}
