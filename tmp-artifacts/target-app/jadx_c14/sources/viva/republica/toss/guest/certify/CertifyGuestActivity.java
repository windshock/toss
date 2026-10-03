package viva.republica.toss.guest.certify;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.base.BaseActivity;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
import o.ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2;
import o.Ripple_androidKt;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o._string;
import o.access13800;
import o.access14300;
import o.createPaints;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.formatMsgs;
import o.getNameFromAnnotation;
import o.maybeUpdateAnimatable;
import o.setContent;
import o.setRandomHost;
import o.startRearDisplaySession;
import o.zzad;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.service.LabActivity;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.MAX)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
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
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return CertifyGuestActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.CertifyGuestActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return CertifyGuestActivity.IAuthTabCallback(this.f$0);
        }
    });

    static {
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallbackDefault = 8;
        int i = readTypedObject + 25;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ getNameFromAnnotation IAuthTabCallback(CertifyGuestActivity certifyGuestActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(certifyGuestActivity);
        }
        onExtraCallbackWithResult(certifyGuestActivity);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i7 | i6)) | (~(i8 | i6));
        int i10 = ~(i2 | i7);
        int i11 = i6 | i10 | (~(i8 | i5));
        int i12 = i6 + i5 + i3 + (1997535707 * i) + (1930545336 * i4);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i6) + 1468203008 + ((-417352845) * i5) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i3) + ((-1408630784) * i) + ((-2070937600) * i4) + (392888320 * i13);
        int i15 = (i6 * (-2054695253)) + 138751921 + (i5 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i3 * (-2054694363)) + (i * 1502648999) + (i4 * 931574424) + (i13 * (-2139684864));
        return i14 + ((i15 * i15) * (-174260224)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ TypographyKtExternalSyntheticLambda0 onExtraCallback(CertifyGuestActivity certifyGuestActivity) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(certifyGuestActivity);
        }
        onNavigationEvent(certifyGuestActivity);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
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

        public static /* synthetic */ Intent IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Context context, long j, long j2, String str, Boolean bool, getNameFromAnnotation getnamefromannotation, boolean z, boolean z2, boolean z3, APMaxLenMode aPMaxLenMode, int i, Object obj) {
            long j3;
            getNameFromAnnotation getnamefromannotation2;
            boolean z4;
            boolean z5;
            int i2 = 2 % 2;
            if ((i & 4) != 0) {
                int i3 = onExtraCallback + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                j3 = 0;
            } else {
                j3 = j2;
            }
            String str2 = (i & 8) != 0 ? "" : str;
            Boolean bool2 = (i & 16) != 0 ? null : bool;
            if ((i & 32) != 0) {
                int i5 = onWarmupCompleted + 39;
                int i6 = i5 % 128;
                onExtraCallback = i6;
                if (i5 % 2 == 0) {
                    int i7 = 94 / 0;
                }
                int i8 = i6 + 61;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 / 5;
                }
                getnamefromannotation2 = null;
            } else {
                getnamefromannotation2 = getnamefromannotation;
            }
            boolean z6 = (i & 64) != 0 ? false : z;
            if ((i & 128) != 0) {
                int i10 = onExtraCallback + 9;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            if ((i & 256) != 0) {
                int i12 = onExtraCallback + 63;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                z5 = false;
            } else {
                z5 = z3;
            }
            return onextracallbackwithresult.onNavigationEvent(context, j, j3, str2, bool2, getnamefromannotation2, z6, z4, z5, (i & 512) != 0 ? null : aPMaxLenMode);
        }

        public final Intent onNavigationEvent(@NotNull Context context, long j, long j2, @NotNull String str, @Nullable Boolean bool, @Nullable getNameFromAnnotation getnamefromannotation, boolean z, boolean z2, boolean z3, @Nullable APMaxLenMode aPMaxLenMode) throws Throwable {
            int i = 2 % 2;
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
                int i2 = onWarmupCompleted + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                zBooleanValue = bool.booleanValue();
            }
            Intent intentPutExtra3 = intentPutExtra2.putExtra("blockSignUp", zBooleanValue).putExtra("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS", getnamefromannotation).putExtra("EXTRA_PROCESS_ONLY_CERTIFY_METHOD", z).putExtra("EXTRA_SKIP_GUARDIAN_AUTH_UNDER_FOURTEEN", z2).putExtra("EXTRA_OVERSEAS_ONBOARDING_USER_INFO", (Parcelable) aPMaxLenMode).putExtra("EXTRA_CONTINUED_FROM_VISITOR_REJECTION", z3);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra3, "");
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return intentPutExtra3;
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), (KeyEvent.getMaxKeyCode() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 59 - Color.blue(0), Color.argb(0, 0, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i4 = $10 + 113;
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
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 47;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $11 + 81;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    try {
                        Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 59 - (Process.myPid() >> 22), 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i9 = 68 / 0;
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
        int i = 2 % 2;
        int i2 = access000 + 47;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        zzad zzadVar = certifyGuestActivity.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 35;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return zzadVar;
    }

    private final TypographyKtExternalSyntheticLambda0 validateRelationship() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) this.onTransact.getValue();
        int i4 = ICustomTabsCallback + 59;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return typographyKtExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TypographyKtExternalSyntheticLambda0 onNavigationEvent(CertifyGuestActivity certifyGuestActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Ripple_androidKt ripple_androidKtFindFragmentById = certifyGuestActivity.getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        Intrinsics.checkNotNull(ripple_androidKtFindFragmentById, "");
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0IAuthTabCallback = ripple_androidKtFindFragmentById.IAuthTabCallback();
        int i4 = access000 + 117;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return typographyKtExternalSyntheticLambda0IAuthTabCallback;
    }

    private final getNameFromAnnotation updateVisuals() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getNameFromAnnotation getnamefromannotation = (getNameFromAnnotation) this.asBinder.getValue();
        int i3 = access000 + 11;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return getnamefromannotation;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 11;
        $11 = i4 % 128;
        char c = 5;
        if (i4 % 2 == 0) {
            int i5 = 5 % 5;
        }
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 61;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (getInterfaceDescriptor ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStubProxy);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i12 = 9 - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1));
                        int iCombineMeasuredStates = 12434 - View.combineMeasuredStates(i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, i12, iCombineMeasuredStates, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(access100)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 10, ExpandableListView.getPackedPositionChild(0L) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c = 5;
                    cArr3 = cArr4;
                    i3 = 0;
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
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 35;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        cancelNotification().onExtraCallbackWithResult();
        setContentView(R.layout.activity_guest);
        setEngagementSignalsCallback();
        CertifyGuestViewModel certifyGuestViewModelCancelNotification = cancelNotification();
        Intent intent = getIntent();
        Object obj = null;
        Object[] objArr = new Object[1];
        a(new char[]{7354, 4725, 46113, 29734, 36688, 12891, 11619, 38652, 10719, 31898, 61747, 24109, 65058, 58675, 28203, 43442, 47925, 41829, 53133, 44553, 40092, 22774}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 93, objArr);
        certifyGuestViewModelCancelNotification.onTransact(intent.getLongExtra(((String) objArr[0]).intern(), 0L));
        certifyGuestViewModelCancelNotification.IAuthTabCallback(getIntent().getBooleanExtra("blockSignUp", false));
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
            setContent setcontentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
            Intrinsics.checkNotNull(setcontentFindFragmentById, "");
            setContent setcontent = (Ripple_androidKt) setcontentFindFragmentById;
            this.IAuthTabCallbackStub = setcontent;
            if (setcontent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setcontent = null;
            }
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = setcontent.IAuthTabCallback().IAuthTabCallbackDefault().onExtraCallback(R.navigation.navigation_guest);
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onExtraCallback(((Integer) onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1131436844, -1131436844, new Object[]{this})).intValue());
            setContent setcontent2 = this.IAuthTabCallbackStub;
            if (setcontent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                setcontent2 = null;
            }
            setcontent2.IAuthTabCallback().onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
            AppBarKtExternalSyntheticLambda25.onNavigationEvent(this, validateRelationship(), new AppBarKtExternalSyntheticLambda26.onNavigationEvent(validateRelationship().asBinder()).onExtraCallbackWithResult((ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2) null).IAuthTabCallback(new AppBarKtExternalSyntheticLambda27.IAuthTabCallback(onNavigationEvent.onExtraCallback)).onExtraCallback());
            validateRelationship().onExtraCallback(this);
            cancelNotification().extraCallback().observe(this, new BaseActivity.ICustomTabsServiceDefault(new onWarmupCompleted()));
            cancelNotification().ICustomTabsCallback().observe(this, new BaseActivity.ICustomTabsServiceDefault(new IAuthTabCallback()));
            if (createPaints.IAuthTabCallback.ICustomTabsCallback()) {
                int i4 = ICustomTabsCallback + 73;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                if (((Boolean) CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{cancelNotification()}, 414350851, -414350837, ICustomTabsCallbackStubProxy.onExtraCallback())).booleanValue()) {
                    int i6 = access000 + 77;
                    ICustomTabsCallback = i6 % 128;
                    if (i6 % 2 == 0) {
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
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 37;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
            viewFindViewById = findViewById(R.id.appbarLayout);
            Intrinsics.checkNotNull(childAt);
            view = null;
            view2 = null;
            z = false;
            i = 27;
        } else {
            childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
            viewFindViewById = findViewById(R.id.appbarLayout);
            Intrinsics.checkNotNull(childAt);
            view = null;
            view2 = null;
            z = false;
            i = 14;
        }
        disableImageViewPreallocationAndroid.onNavigationEvent(childAt, viewFindViewById, view, view2, z, i, (Object) null);
        int i4 = ICustomTabsCallback + 9;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_certify_guest_option, menu);
        int i4 = ICustomTabsCallback + 41;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        CertifyGuestActivity certifyGuestActivity = (CertifyGuestActivity) objArr[0];
        int i2 = 2 % 2;
        if (certifyGuestActivity.cancelNotification().ICustomTabsCallbackDefault()) {
            return Integer.valueOf(certifyGuestActivity.ICustomTabsServiceDefault());
        }
        getNameFromAnnotation getnamefromannotationUpdateVisuals = certifyGuestActivity.updateVisuals();
        if (getnamefromannotationUpdateVisuals == null) {
            int i3 = ICustomTabsCallback + 121;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = onExtraCallback.onExtraCallbackWithResult[getnamefromannotationUpdateVisuals.ordinal()];
        }
        if (i == -1) {
            return Integer.valueOf(certifyGuestActivity.ICustomTabsServiceDefault());
        }
        int i5 = ICustomTabsCallback + 5;
        int i6 = i5 % 128;
        access000 = i6;
        if (i5 % 2 == 0 ? i == 1 : i == 1) {
            return Integer.valueOf(certifyGuestActivity.ICustomTabsServiceDefault());
        }
        if (i == 2) {
            return Integer.valueOf(R.id.guardianPendingCertifyFragment);
        }
        int i7 = i6 + 119;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
        if (i == 3) {
            return Integer.valueOf(R.id.guardianPendingCertifyFragment);
        }
        if (i == 4) {
            return Integer.valueOf(R.id.guardianAgreementFragment);
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        validateRelationship().onNavigationEvent(this);
        int i4 = ICustomTabsCallback + 41;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public void onDestinationChanged(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
        onActivityLayout();
        int i4 = ICustomTabsCallback + 33;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access000 + 103;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.userInfoDummyFragment;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    private final void access200() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
        int i2 = access000 + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
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

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = CertifyGuestActivity.this.new asBinder(access13800Var);
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallbackWithResult + 121;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i5 == 0) {
                    int i6 = 60 / 0;
                }
            }
            BaseActivity baseActivity = CertifyGuestActivity.this;
            String string = baseActivity.getString(R.string.visitor_continue_onboarding_toast);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(baseActivity, string);
            Object[] objArr = new Object[1];
            a(new int[]{0, 59, 101, 0}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1}, objArr);
            onnavigationevent.IAuthTabCallback(((String) objArr[0]).intern()).onExtraCallback();
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int length;
            char[] cArr;
            int i2;
            int i3 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = onWarmupCompleted;
            long j = 0;
            if (cArr2 != null) {
                int i8 = $11 + 47;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 35284), 35 - (KeyEvent.getMaxKeyCode() >> 16), 14239 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2++;
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
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr2, i4, cArr3, 0, i5);
            if (bArr != null) {
                char[] cArr4 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i9 = $10 + 13;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.indexOf("", "")), View.getDefaultSize(0, 0) + 65, (ViewConfiguration.getPressedStateDuration() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), Color.red(0) + 29, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i13 = $11 + 5;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
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
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i15 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i15, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i15);
                int i16 = $11 + 121;
                $10 = i16 % 128;
                i = 2;
                int i17 = i16 % 2;
            } else {
                i = 2;
            }
            if (z) {
                int i18 = $10 + 79;
                $11 = i18 % 128;
                int i19 = i18 % i;
                char[] cArr6 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                int i20 = $11 + 65;
                $10 = i20 % 128;
                i = 2;
                int i21 = i20 % 2;
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                int i22 = $11 + 113;
                $10 = i22 % 128;
                int i23 = i22 % i;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.app.Activity, viva.republica.toss.guest.certify.CertifyGuestActivity] */
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
        int i = 2 % 2;
        Intent intent = certifyGuestActivity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        int i2 = access000 + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!extras.containsKey("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS")) {
            return null;
        }
        if (!zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            Object obj = extras2 != null ? extras2.get("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS") : null;
            return (getNameFromAnnotation) (obj instanceof getNameFromAnnotation ? obj : null);
        }
        int i4 = access000 + 115;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || (string = extras3.getString("EXTRA_UNDER_FOURTEEN_GUARDIAN_CERTIFY_STATUS")) == 0) {
            return null;
        }
        if (Intrinsics.areEqual(getNameFromAnnotation.class, Integer.class)) {
            string = StringsKt.toIntOrNull((String) string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Long.class)) {
            string = StringsKt.toLongOrNull((String) string);
        } else if (!(!Intrinsics.areEqual(getNameFromAnnotation.class, Float.class))) {
            string = StringsKt.toFloatOrNull((String) string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Double.class)) {
            int i6 = ICustomTabsCallback + 43;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            string = StringsKt.toDoubleOrNull((String) string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Short.class)) {
            string = StringsKt.toShortOrNull((String) string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Byte.class)) {
            string = StringsKt.toByteOrNull((String) string);
        } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Boolean.class)) {
            string = Boolean.valueOf(Boolean.parseBoolean(string));
        } else {
            if (Intrinsics.areEqual(getNameFromAnnotation.class, Character.class)) {
                string = Character.valueOf(string.charAt(0));
            } else if (!Intrinsics.areEqual(getNameFromAnnotation.class, String.class)) {
                if (Intrinsics.areEqual(getNameFromAnnotation.class, Integer[].class)) {
                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listSplit$default) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i8 = ICustomTabsCallback + 1;
                        access000 = i8 % 128;
                        int i9 = i8 % 2;
                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                        int i10 = ICustomTabsCallback + 69;
                        access000 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    string = arrayList2.toArray(new Integer[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Long[].class)) {
                    List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listSplit$default2) {
                        if (((String) obj3).length() > 0) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    int i12 = ICustomTabsCallback + 93;
                    access000 = i12 % 128;
                    int i13 = i12 % 2;
                    while (it2.hasNext()) {
                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                    }
                    string = arrayList4.toArray(new Long[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Float[].class)) {
                    List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : listSplit$default3) {
                        if (((String) obj4).length() > 0) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                    }
                    string = arrayList6.toArray(new Float[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Double[].class)) {
                    List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj5 : listSplit$default4) {
                        if (((String) obj5).length() > 0) {
                            int i14 = access000 + 99;
                            ICustomTabsCallback = i14 % 128;
                            int i15 = i14 % 2;
                            arrayList7.add(obj5);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                    }
                    string = arrayList8.toArray(new Double[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Short[].class)) {
                    List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj6 : listSplit$default5) {
                        if (((String) obj6).length() > 0) {
                            arrayList9.add(obj6);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                    }
                    string = arrayList10.toArray(new Short[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Byte[].class)) {
                    List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj7 : listSplit$default6) {
                        if (((String) obj7).length() > 0) {
                            arrayList11.add(obj7);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                    Iterator it6 = arrayList11.iterator();
                    while (!(!it6.hasNext())) {
                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                    }
                    string = arrayList12.toArray(new Byte[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Boolean[].class)) {
                    List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj8 : listSplit$default7) {
                        if (((String) obj8).length() > 0) {
                            int i16 = access000 + 117;
                            ICustomTabsCallback = i16 % 128;
                            if (i16 % 2 == 0) {
                                arrayList13.add(obj8);
                                throw null;
                            }
                            arrayList13.add(obj8);
                        }
                    }
                    ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                    Iterator it7 = arrayList13.iterator();
                    while (it7.hasNext()) {
                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                    }
                    string = arrayList14.toArray(new Boolean[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, Character[].class)) {
                    List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList15 = new ArrayList();
                    for (Object obj9 : listSplit$default8) {
                        if (((String) obj9).length() > 0) {
                            int i17 = access000 + 67;
                            ICustomTabsCallback = i17 % 128;
                            if (i17 % 2 == 0) {
                                arrayList15.add(obj9);
                                obj.hashCode();
                                throw null;
                            }
                            arrayList15.add(obj9);
                        }
                    }
                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                    Iterator it8 = arrayList15.iterator();
                    while (it8.hasNext()) {
                        arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                    }
                    string = arrayList16.toArray(new Character[0]);
                } else if (Intrinsics.areEqual(getNameFromAnnotation.class, String[].class)) {
                    List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
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
                        int i18 = ICustomTabsCallback + 123;
                        access000 = i18 % 128;
                        int i19 = i18 % 2;
                        string = 0;
                    }
                }
            }
        }
        return (getNameFromAnnotation) (string instanceof getNameFromAnnotation ? string : null);
    }

    public static final class onNavigationEvent implements Function0<Boolean> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

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

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = access000 + 79;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = access000 + 1;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.certify.Hilt_CertifyGuestActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 119;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 63;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
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

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(Unit unit) {
            String str = ((zzad) CertifyGuestActivity.onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 328435748, -328435747, new Object[]{CertifyGuestActivity.this})).ITrustedWebActivityCallback_Parcel() + "/teens/introduction?_transparent=adaptive&referrer=enrollment_tip";
            BaseActivity baseActivity = CertifyGuestActivity.this;
            baseActivity.startActivity(LabActivity.IAuthTabCallback.onNavigationEvent(LabActivity.Companion, baseActivity, str, "", (String) null, (String) null, false, false, false, 248, (Object) null));
        }
    }

    public static final class onWarmupCompleted implements Function1<Unit, Unit> {
        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(Unit unit) {
            String str = ((zzad) CertifyGuestActivity.onExtraCallback(_string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 328435748, -328435747, new Object[]{CertifyGuestActivity.this})).ITrustedWebActivityCallback_Parcel() + "/teens/introduction?_transparent=adaptive&referrer=enrollment_guide";
            BaseActivity baseActivity = CertifyGuestActivity.this;
            baseActivity.startActivity(LabActivity.IAuthTabCallback.onNavigationEvent(LabActivity.Companion, baseActivity, str, "", (String) null, (String) null, false, false, false, 248, (Object) null));
        }
    }
}
