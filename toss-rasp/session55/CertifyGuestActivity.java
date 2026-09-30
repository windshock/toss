package viva.republica.toss.guest.certify;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import im.toss.base.BaseActivity;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.APMaxLenMode;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AppBarKtExternalSyntheticLambda25;
import o.AppBarKtExternalSyntheticLambda26;
import o.AppBarKtExternalSyntheticLambda27;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7;
import o.HexEncoder;
import o.Ripple_androidKt;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o._string;
import o.access13800;
import o.access14100;
import o.createPaints;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.formatMsgs;
import o.getNameFromAnnotation;
import o.onLoadStarted;
import o.setContent;
import o.startRearDisplaySession;
import o.verifySignatureValue_NoAlgorithmInfo;
import o.zzad;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.service.LabActivity;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.MAX)
/* loaded from: classes14.dex */
public final class CertifyGuestActivity extends Hilt_CertifyGuestActivity implements TypographyKtExternalSyntheticLambda0.onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallbackDefault;
    private static char IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 1;
    private static int access000 = 0;
    private static char access100 = 0;
    private static char asInterface = 0;
    private static char getInterfaceDescriptor = 0;
    private static int readTypedObject = 1;
    private static int writeTypedObject;
    private setContent IAuthTabCallbackStub;

    @Inject
    public zzad environments;
    private final Lazy onTransact = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CertifyGuestActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CertifyGuestActivity.IAuthTabCallback(this.f$0);
        }
    });

    /* loaded from: classes18.dex */
    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[getNameFromAnnotation.values().length];
            try {
                iArr[getNameFromAnnotation.BEFORE_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getNameFromAnnotation.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getNameFromAnnotation.ISSUANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getNameFromAnnotation.RESET_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallbackDefault = 8;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ getNameFromAnnotation IAuthTabCallback(CertifyGuestActivity certifyGuestActivity) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 115;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(certifyGuestActivity);
        }
        onExtraCallbackWithResult(certifyGuestActivity);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | (~(i8 | i7)) | (~(i9 | i7));
        int i11 = ~(i3 | i8);
        int i12 = i7 | i11 | (~(i9 | i6));
        int i13 = i7 + i6 + i4 + (1997535707 * i2) + (1930545336 * i5);
        int i14 = i13 * i13;
        int i15 = ((-1352905585) * i7) + 1468203008 + ((-417352845) * i6) + (i10 * 1679707278) + (1679707278 * i11) + ((-1679707278) * i12) + (1262354432 * i4) + ((-1408630784) * i2) + ((-2070937600) * i5) + (392888320 * i14);
        int i16 = (i7 * (-2054695253)) + 138751921 + (i6 * (-2054693473)) + (i10 * (-890)) + (i11 * (-890)) + (i12 * 890) + (i4 * (-2054694363)) + (i2 * 1502648999) + (i5 * 931574424) + (i14 * (-2139684864));
        return i15 + ((i16 * i16) * (-174260224)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ TypographyKtExternalSyntheticLambda0 onExtraCallback(CertifyGuestActivity certifyGuestActivity) {
        int i2 = 2 % 2;
        int i3 = access000 + 55;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(certifyGuestActivity);
        }
        onNavigationEvent(certifyGuestActivity);
        throw null;
    }

    @Override // o.AFj1oSDKAFa1ySDK
    public long getScreenId() {
        int i2 = 2 % 2;
        int i3 = access000 + 67;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -2606828757439394060L;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Context context, long j, long j2, String str, Boolean bool, getNameFromAnnotation getnamefromannotation, boolean z, boolean z2, boolean z3, APMaxLenMode aPMaxLenMode, int i2, Object obj) {
            long j3;
            getNameFromAnnotation getnamefromannotation2;
            boolean z4;
            boolean z5;
            int i3 = 2 % 2;
            if ((i2 & 4) != 0) {
                int i4 = onExtraCallback + 11;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                j3 = 0;
            } else {
                j3 = j2;
            }
            String str2 = (i2 & 8) != 0 ? "" : str;
            Boolean bool2 = (i2 & 16) != 0 ? null : bool;
            if ((i2 & 32) != 0) {
                int i6 = onWarmupCompleted + 39;
                int i7 = i6 % 128;
                onExtraCallback = i7;
                if (i6 % 2 == 0) {
                    int i8 = 94 / 0;
                }
                int i9 = i7 + 61;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 / 5;
                }
                getnamefromannotation2 = null;
            } else {
                getnamefromannotation2 = getnamefromannotation;
            }
            boolean z6 = (i2 & 64) != 0 ? false : z;
            if ((i2 & 128) != 0) {
                int i11 = onExtraCallback + 9;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            if ((i2 & 256) != 0) {
                int i13 = onExtraCallback + 63;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                z5 = false;
            } else {
                z5 = z3;
            }
            return onextracallbackwithresult.onNavigationEvent(context, j, j3, str2, bool2, getnamefromannotation2, z6, z4, z5, (i2 & 512) != 0 ? null : aPMaxLenMode);
        }

        public final Intent onNavigationEvent(@NotNull Context context, long j, long j2, @NotNull String str, @Nullable Boolean bool, @Nullable getNameFromAnnotation getnamefromannotation, boolean z, boolean z2, boolean z3, @Nullable APMaxLenMode aPMaxLenMode) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CertifyGuestActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{52102, 59372, 37753, 20212, 31326, 5583, 49486, 64727, 43070, 23487, 30513, 8833, 56836, 35213, 42258, 20841, 3322, 14443, 60371, 34633, 45766, 28228}, 11383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            boolean zBooleanValue = false;
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), j);
            Object[] objArr2 = new Object[1];
            a(new char[]{52102, 5806, 29181, 23566, 48982, 39317, 58555, 51173, 8741, 3408, 28564, 19144, 38368, 61499, 54113}, 56629 - View.resolveSize(0, 0), objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), j2).putExtra("EXTRA_REFERRER", str);
            if (bool != null) {
                int i3 = onWarmupCompleted + 85;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                zBooleanValue = bool.booleanValue();
            }
            Intent intentPutExtra3 = intentPutExtra2.putExtra(verifySignatureValue_NoAlgorithmInfo.EXTRA_BLOCK_SIGN_UP, zBooleanValue).putExtra("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS", getnamefromannotation).putExtra("EXTRA_PROCESS_ONLY_CERTIFY_METHOD", z).putExtra("EXTRA_SKIP_GUARDIAN_AUTH_UNDER_FOURTEEN", z2).putExtra("EXTRA_OVERSEAS_ONBOARDING_USER_INFO", aPMaxLenMode).putExtra("EXTRA_CONTINUED_FROM_VISITOR_REJECTION", z3);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra3, "");
            int i5 = onWarmupCompleted + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return intentPutExtra3;
        }

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), (KeyEvent.getMaxKeyCode() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 59 - Color.blue(0), Color.argb(0, 0, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i5 = $10 + 113;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
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
            int i7 = $10 + 47;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i9 = $11 + 81;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    try {
                        Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 59 - (Process.myPid() >> 22), 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i10 = 68 / 0;
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
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 58 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr2);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CertifyGuestActivity certifyGuestActivity = (CertifyGuestActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = access000 + 47;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        int i5 = i3 % 2;
        zzad zzadVar = certifyGuestActivity.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i4 + 35;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 51 / 0;
        }
        return zzadVar;
    }

    private final TypographyKtExternalSyntheticLambda0 validateRelationship() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 87;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) this.onTransact.getValue();
        int i5 = ICustomTabsCallback + 59;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return typographyKtExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TypographyKtExternalSyntheticLambda0 onNavigationEvent(CertifyGuestActivity certifyGuestActivity) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 49;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Fragment fragmentFindFragmentById = certifyGuestActivity.getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        Intrinsics.checkNotNull(fragmentFindFragmentById, "");
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0IAuthTabCallback = ((Ripple_androidKt) fragmentFindFragmentById).IAuthTabCallback();
        int i5 = access000 + 117;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return typographyKtExternalSyntheticLambda0IAuthTabCallback;
    }

    private final getNameFromAnnotation updateVisuals() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 85;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getNameFromAnnotation getnamefromannotation = (getNameFromAnnotation) this.asBinder.getValue();
        int i4 = access000 + 11;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return getnamefromannotation;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $10 + 11;
        $11 = i5 % 128;
        char c = 5;
        if (i5 % 2 == 0) {
            int i6 = 5 % 5;
        }
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $11 + 61;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (getInterfaceDescriptor ^ 1094535280733222934L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStubProxy);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i13 = 9 - (ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1));
                        int iCombineMeasuredStates = 12434 - View.combineMeasuredStates(i4, i4);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, i13, iCombineMeasuredStates, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(access100)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 10, ExpandableListView.getPackedPositionChild(0L) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    c = 5;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            char c4 = c;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, 19902 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            c = c4;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity, im.toss.uikit.base.UIKitBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) throws Exception {
        int i2 = 2 % 2;
        int i3 = access000 + 35;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        cancelNotification().onExtraCallbackWithResult();
        setContentView(R.layout.activity_guest);
        setEngagementSignalsCallback();
        CertifyGuestViewModel certifyGuestViewModelCancelNotification = cancelNotification();
        Intent intent = getIntent();
        Object obj = null;
        Object[] objArr = new Object[1];
        a(new char[]{7354, 4725, 46113, 29734, 36688, 12891, 11619, 38652, 10719, 31898, 61747, 24109, 65058, 58675, 28203, 43442, 47925, 41829, 53133, 44553, 40092, 22774}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 93, objArr);
        certifyGuestViewModelCancelNotification.onTransact(intent.getLongExtra(((String) objArr[0]).intern(), 0L));
        certifyGuestViewModelCancelNotification.IAuthTabCallback(getIntent().getBooleanExtra(verifySignatureValue_NoAlgorithmInfo.EXTRA_BLOCK_SIGN_UP, false));
        Intent intent2 = getIntent();
        Object[] objArr2 = new Object[1];
        a(new char[]{7354, 4725, 46113, 29734, 36688, 12891, 10131, 43008, 51304, 65325, 19360, 30280, 21121, 8538, 10329, 18295}, Drawable.resolveOpacity(0, 0) + 15, objArr2);
        certifyGuestViewModelCancelNotification.onExtraCallback(intent2.getLongExtra(((String) objArr2[0]).intern(), 0L));
        String stringExtra = getIntent().getStringExtra("EXTRA_REFERRER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{certifyGuestViewModelCancelNotification, stringExtra}, -803660786, 803660796, ICustomTabsCallbackStubProxy.onExtraCallback());
        certifyGuestViewModelCancelNotification.IAuthTabCallbackStubProxy(getIntent().getBooleanExtra("EXTRA_PROCESS_ONLY_CERTIFY_METHOD", false));
        certifyGuestViewModelCancelNotification.asInterface(updateVisuals() == getNameFromAnnotation.RESET_PASSWORD);
        CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{certifyGuestViewModelCancelNotification, Boolean.valueOf(getIntent().getBooleanExtra("EXTRA_SKIP_GUARDIAN_AUTH_UNDER_FOURTEEN", false))}, -1289152956, 1289152976, ICustomTabsCallbackStubProxy.onExtraCallback());
        CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{certifyGuestViewModelCancelNotification, Boolean.valueOf(getIntent().getBooleanExtra("EXTRA_CONTINUED_FROM_VISITOR_REJECTION", false))}, 559311633, -559311620, ICustomTabsCallbackStubProxy.onExtraCallback());
        if (updateVisuals() == null || HexEncoder.onNavigationEvent(this, false)) {
            Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
            Intrinsics.checkNotNull(fragmentFindFragmentById, "");
            Ripple_androidKt ripple_androidKt = (Ripple_androidKt) fragmentFindFragmentById;
            this.IAuthTabCallbackStub = ripple_androidKt;
            if (ripple_androidKt == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                ripple_androidKt = null;
            }
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = ripple_androidKt.IAuthTabCallback().IAuthTabCallbackDefault().onExtraCallback(R.navigation.navigation_guest);
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onExtraCallback(((Integer) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1131436844, -1131436844, new Object[]{this})).intValue());
            setContent setcontent = this.IAuthTabCallbackStub;
            if (setcontent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setcontent = null;
            }
            setcontent.IAuthTabCallback().onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
            AppBarKtExternalSyntheticLambda25.onNavigationEvent(this, validateRelationship(), new AppBarKtExternalSyntheticLambda26.onNavigationEvent(validateRelationship().asBinder()).onExtraCallbackWithResult(null).IAuthTabCallback(new AppBarKtExternalSyntheticLambda27.IAuthTabCallback(onNavigationEvent.onExtraCallback)).onExtraCallback());
            validateRelationship().onExtraCallback((TypographyKtExternalSyntheticLambda0.onExtraCallback) this);
            cancelNotification().extraCallback().observe(this, new BaseActivity.ICustomTabsServiceDefault(new onWarmupCompleted()));
            cancelNotification().ICustomTabsCallback().observe(this, new BaseActivity.ICustomTabsServiceDefault(new IAuthTabCallback()));
            if (createPaints.IAuthTabCallback.ICustomTabsCallback()) {
                int i5 = ICustomTabsCallback + 73;
                access000 = i5 % 128;
                int i6 = i5 % 2;
                if (((Boolean) CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{cancelNotification()}, 414350851, -414350837, ICustomTabsCallbackStubProxy.onExtraCallback())).booleanValue()) {
                    int i7 = access000 + 77;
                    ICustomTabsCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        access200();
                        obj.hashCode();
                        throw null;
                    }
                    access200();
                }
            }
            IPostMessageServiceStubProxy();
        }
    }

    private final void setEngagementSignalsCallback() {
        View childAt;
        View viewFindViewById;
        View view;
        View view2;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 37;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
            viewFindViewById = findViewById(R.id.appbarLayout);
            Intrinsics.checkNotNull(childAt);
            view = null;
            view2 = null;
            z = false;
            i2 = 27;
        } else {
            childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
            viewFindViewById = findViewById(R.id.appbarLayout);
            Intrinsics.checkNotNull(childAt);
            view = null;
            view2 = null;
            z = false;
            i2 = 14;
        }
        disableImageViewPreallocationAndroid.onNavigationEvent(childAt, viewFindViewById, view, view2, z, i2, (Object) null);
        int i5 = ICustomTabsCallback + 9;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 125;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_certify_guest_option, menu);
        int i5 = ICustomTabsCallback + 41;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return true;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i2;
        CertifyGuestActivity certifyGuestActivity = (CertifyGuestActivity) objArr[0];
        int i3 = 2 % 2;
        if (certifyGuestActivity.cancelNotification().ICustomTabsCallbackDefault()) {
            return Integer.valueOf(certifyGuestActivity.ICustomTabsServiceDefault());
        }
        getNameFromAnnotation getnamefromannotationUpdateVisuals = certifyGuestActivity.updateVisuals();
        if (getnamefromannotationUpdateVisuals == null) {
            int i4 = ICustomTabsCallback + 121;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            i2 = -1;
        } else {
            i2 = onExtraCallback.onExtraCallbackWithResult[getnamefromannotationUpdateVisuals.ordinal()];
        }
        if (i2 == -1) {
            return Integer.valueOf(certifyGuestActivity.ICustomTabsServiceDefault());
        }
        int i6 = ICustomTabsCallback + 5;
        int i7 = i6 % 128;
        access000 = i7;
        if (i6 % 2 == 0 ? i2 == 1 : i2 == 1) {
            return Integer.valueOf(certifyGuestActivity.ICustomTabsServiceDefault());
        }
        if (i2 == 2) {
            return Integer.valueOf(R.id.guardianPendingCertifyFragment);
        }
        int i8 = i7 + 119;
        ICustomTabsCallback = i8 % 128;
        int i9 = i8 % 2;
        if (i2 == 3) {
            return Integer.valueOf(R.id.guardianPendingCertifyFragment);
        }
        if (i2 == 4) {
            return Integer.valueOf(R.id.guardianAgreementFragment);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity, im.toss.uikit.base.UIKitBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 121;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        super.onDestroy();
        validateRelationship().onNavigationEvent((TypographyKtExternalSyntheticLambda0.onExtraCallback) this);
        int i5 = ICustomTabsCallback + 41;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
    }

    @Override // o.TypographyKtExternalSyntheticLambda0.onExtraCallback
    public void onDestinationChanged(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = access000 + 65;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
        onActivityLayout();
        int i5 = ICustomTabsCallback + 33;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final int ICustomTabsServiceDefault() {
        int i2 = 2 % 2;
        int i3 = access000 + 103;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.id.userInfoDummyFragment;
        if (i4 != 0) {
            return i5;
        }
        throw null;
    }

    private final void access200() {
        int i2 = 2 % 2;
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new asBinder(null), 3, null);
        int i3 = access000 + 101;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static char[] onWarmupCompleted = {27176, 27293, 27287, 27289, 27288, 27381, 27351, 27354, 27384, 27286, 27265, 27265, 27293, 27269, 27363, 27384, 27288, 27288, 27286, 27387, 27390, 27294, 27389, 27388, 27292, 27288, 27287, 27293, 27266, 27295, 27387, 27363, 27264, 27293, 27292, 27293, 27293, 27389, 27360, 27268, 27269, 27271, 27266, 27391, 27361, 27295, 27294, 27268, 27264, 27388, 27387, 27288, 27290, 27288, 27384, 27391, 27293, 27288, 27293};
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            asBinder asbinder = CertifyGuestActivity.this.new asBinder(access13800Var);
            int i3 = onExtraCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return asbinder;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i3 % 2 == 0) {
                return onNavigationEvent(findresandmsg2, access13800Var2);
            }
            onNavigationEvent(findresandmsg2, access13800Var2);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((asBinder) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 87;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                access14100.onExtraCallback();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallbackWithResult + 121;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 == 0) {
                    int i7 = 60 / 0;
                }
            }
            CertifyGuestActivity certifyGuestActivity = CertifyGuestActivity.this;
            String string = certifyGuestActivity.getString(R.string.visitor_continue_onboarding_toast);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(certifyGuestActivity, string);
            Object[] objArr = new Object[1];
            a(new int[]{0, 59, 101, 0}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1}, objArr);
            onnavigationevent.IAuthTabCallback(((String) objArr[0]).intern()).onExtraCallback();
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i2;
            int length;
            char[] cArr;
            int i3;
            int i4 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr2 = onWarmupCompleted;
            long j = 0;
            if (cArr2 != null) {
                int i9 = $11 + 47;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i3 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 35284), 35 - (KeyEvent.getMaxKeyCode() >> 16), 14239 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr2, i5, cArr3, 0, i6);
            if (bArr != null) {
                char[] cArr4 = new char[i6];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                    int i10 = $10 + 13;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.indexOf("", "")), View.getDefaultSize(0, 0) + 65, (ViewConfiguration.getPressedStateDuration() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), Color.red(0) + 29, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17656, 1451542198, false, CampaignEx.JSON_KEY_AD_Q, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i14 = $11 + 5;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    try {
                        Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 69, 12486 - TextUtils.getOffsetBefore("", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                cArr3 = cArr4;
            }
            if (i8 > 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i16 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i16, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i16);
                int i17 = $11 + 121;
                $10 = i17 % 128;
                i2 = 2;
                int i18 = i17 % 2;
            } else {
                i2 = 2;
            }
            if (z) {
                int i19 = $10 + 79;
                $11 = i19 % 128;
                int i20 = i19 % i2;
                char[] cArr6 = new char[i6];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                int i21 = $11 + 65;
                $10 = i21 % 128;
                i2 = 2;
                int i22 = i21 % 2;
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                int i23 = $11 + 113;
                $10 = i23 % 128;
                int i24 = i23 % i2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[]] */
    private static final getNameFromAnnotation onExtraCallbackWithResult(CertifyGuestActivity certifyGuestActivity) {
        Bundle extras;
        ?? string;
        Object next;
        int i2 = 2 % 2;
        Intent intent = certifyGuestActivity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        int i3 = access000 + 117;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!extras.containsKey("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS")) {
            return null;
        }
        if (!zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            Object obj = extras2 != null ? extras2.get("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS") : null;
            return (getNameFromAnnotation) (obj instanceof getNameFromAnnotation ? obj : null);
        }
        int i5 = access000 + 115;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || (string = extras3.getString("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS")) == 0) {
            return null;
        }
        if (Intrinsics.areEqual(getNameFromAnnotation.class, Integer.class)) {
            string = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Long.class)) {
            string = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
        } else if (!(!Intrinsics.areEqual(getNameFromAnnotation.class, Float.class))) {
            string = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Double.class)) {
            int i7 = ICustomTabsCallback + 43;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            string = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Short.class)) {
            string = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Byte.class)) {
            string = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Boolean.class)) {
            string = Boolean.valueOf(Boolean.parseBoolean(string));
        } else {
            if (Intrinsics.areEqual(getNameFromAnnotation.class, Character.class)) {
                string = Character.valueOf(string.charAt(0));
            } else if (!Intrinsics.areEqual(getNameFromAnnotation.class, String.class)) {
                if (Intrinsics.areEqual(getNameFromAnnotation.class, Integer[].class)) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listSplit$default) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i9 = ICustomTabsCallback + 1;
                        access000 = i9 % 128;
                        int i10 = i9 % 2;
                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                        int i11 = ICustomTabsCallback + 69;
                        access000 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    string = arrayList2.toArray(new Integer[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Long[].class)) {
                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listSplit$default2) {
                        if (((String) obj3).length() > 0) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    int i13 = ICustomTabsCallback + 93;
                    access000 = i13 % 128;
                    int i14 = i13 % 2;
                    while (it2.hasNext()) {
                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                    }
                    string = arrayList4.toArray(new Long[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Float[].class)) {
                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : listSplit$default3) {
                        if (((String) obj4).length() > 0) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                    }
                    string = arrayList6.toArray(new Float[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Double[].class)) {
                    List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj5 : listSplit$default4) {
                        if (((String) obj5).length() > 0) {
                            int i15 = access000 + 99;
                            ICustomTabsCallback = i15 % 128;
                            int i16 = i15 % 2;
                            arrayList7.add(obj5);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                    }
                    string = arrayList8.toArray(new Double[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Short[].class)) {
                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj6 : listSplit$default5) {
                        if (((String) obj6).length() > 0) {
                            arrayList9.add(obj6);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                    }
                    string = arrayList10.toArray(new Short[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Byte[].class)) {
                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj7 : listSplit$default6) {
                        if (((String) obj7).length() > 0) {
                            arrayList11.add(obj7);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                    Iterator it6 = arrayList11.iterator();
                    while (!(!it6.hasNext())) {
                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                    }
                    string = arrayList12.toArray(new Byte[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Boolean[].class)) {
                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj8 : listSplit$default7) {
                        if (((String) obj8).length() > 0) {
                            int i17 = access000 + 117;
                            ICustomTabsCallback = i17 % 128;
                            if (i17 % 2 == 0) {
                                arrayList13.add(obj8);
                                throw null;
                            }
                            arrayList13.add(obj8);
                        }
                    }
                    ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                    Iterator it7 = arrayList13.iterator();
                    while (it7.hasNext()) {
                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                    }
                    string = arrayList14.toArray(new Boolean[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Character[].class)) {
                    List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList15 = new ArrayList();
                    for (Object obj9 : listSplit$default8) {
                        if (((String) obj9).length() > 0) {
                            int i18 = access000 + 67;
                            ICustomTabsCallback = i18 % 128;
                            if (i18 % 2 == 0) {
                                arrayList15.add(obj9);
                                obj.hashCode();
                                throw null;
                            }
                            arrayList15.add(obj9);
                        }
                    }
                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                    Iterator it8 = arrayList15.iterator();
                    while (it8.hasNext()) {
                        arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString().charAt(0)));
                    }
                    string = arrayList16.toArray(new Character[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, String[].class)) {
                    List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList17 = new ArrayList();
                    for (Object obj10 : listSplit$default9) {
                        if (((String) obj10).length() > 0) {
                            arrayList17.add(obj10);
                        }
                    }
                    string = arrayList17.toArray(new String[0]);
                } else {
                    Object[] enumConstants = getNameFromAnnotation.class.getEnumConstants();
                    if (enumConstants != null) {
                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                        for (Object obj11 : enumConstants) {
                            Intrinsics.checkNotNull(obj11, "");
                            arrayList18.add((Enum) obj11);
                        }
                        Iterator it9 = arrayList18.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it9.next();
                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                break;
                            }
                        }
                        string = (Enum) next;
                    } else {
                        string = 0;
                    }
                    if (string == 0) {
                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                            throw new IllegalArgumentException(getNameFromAnnotation.class.getSimpleName() + " is not supported");
                        }
                        int i19 = ICustomTabsCallback + 123;
                        access000 = i19 % 128;
                        int i20 = i19 % 2;
                        string = 0;
                    }
                }
            }
        }
        return (getNameFromAnnotation) (string instanceof getNameFromAnnotation ? string : null);
    }

    public static final class onNavigationEvent implements Function0<Boolean> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private final int ICustomTabsServiceStub() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        return ((Integer) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, _string.onNavigationEvent.IAuthTabCallback(), 1131436844, -1131436844, new Object[]{this})).intValue();
    }

    public final zzad IAuthTabCallback() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        return (zzad) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, _string.onNavigationEvent.IAuthTabCallback(), 328435748, -328435747, new Object[]{this});
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity, im.toss.uikit.base.UIKitBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i2 = 2 % 2;
        int i3 = access000 + 67;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        if (i4 == 0) {
            int i5 = 24 / 0;
        }
        int i6 = access000 + 79;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity, im.toss.uikit.base.UIKitBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws Exception {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 79;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity, im.toss.uikit.base.UIKitBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = access000 + 9;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        int i6 = access000 + 1;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity, im.toss.uikit.base.UIKitBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i2 = 2 % 2;
        int i3 = access000 + 119;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        super.attachBaseContext(context);
        int i5 = access000 + 63;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void onNavigationEvent() {
        asInterface = (char) 2982;
        access100 = (char) 29198;
        getInterfaceDescriptor = (char) 3250;
        IAuthTabCallbackStubProxy = (char) 10399;
    }

    public static final class IAuthTabCallback implements Function1<Unit, Unit> {
        public IAuthTabCallback() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Unit unit) {
            onExtraCallbackWithResult(unit);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(Unit unit) {
            String str = ((zzad) CertifyGuestActivity.onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 328435748, -328435747, new Object[]{CertifyGuestActivity.this})).ITrustedWebActivityCallback_Parcel() + "/teens/introduction?_transparent=adaptive&referrer=enrollment_tip";
            CertifyGuestActivity certifyGuestActivity = CertifyGuestActivity.this;
            certifyGuestActivity.startActivity(LabActivity.IAuthTabCallback.onNavigationEvent(LabActivity.Companion, certifyGuestActivity, str, "", null, null, false, false, false, 248, null));
        }
    }

    public static final class onWarmupCompleted implements Function1<Unit, Unit> {
        public onWarmupCompleted() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Unit unit) {
            onExtraCallback(unit);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(Unit unit) {
            String str = ((zzad) CertifyGuestActivity.onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 328435748, -328435747, new Object[]{CertifyGuestActivity.this})).ITrustedWebActivityCallback_Parcel() + "/teens/introduction?_transparent=adaptive&referrer=enrollment_guide";
            CertifyGuestActivity certifyGuestActivity = CertifyGuestActivity.this;
            certifyGuestActivity.startActivity(LabActivity.IAuthTabCallback.onNavigationEvent(LabActivity.Companion, certifyGuestActivity, str, "", null, null, false, false, false, 248, null));
        }
    }
}
