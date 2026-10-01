package o;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
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
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.annotations.SerializedName;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.security.impl.R;
import im.toss.security.impl.malware.MalwareAppDetectorImpl$;
import im.toss.security.impl.malware.MalwareAppDetectorImpl$showSuspiciousNotification$1$;
import im.toss.security.impl.malware.MalwareDetectActivity;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import im.toss.security.impl.malware.MalwareDetectActivity$onNavigationEvent;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.EngineConfig1;
import o.bindContext;
import o.s3;
import o.s5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class s3d implements s8ExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char[] IAuthTabCallback_Parcel = null;
    private static boolean access000 = false;
    private static boolean access100 = false;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 1;
    private static char[] getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onWarmupCompleted;
    private static int readTypedObject;
    private static int writeTypedObject;
    private String IAuthTabCallbackDefault;
    private final findResAndMsg IAuthTabCallbackStub;
    private final Lazy asBinder;
    private final trackCheckout asInterface;
    private final Map<Pair<String, Long>, String> onNavigationEvent;
    private final s5a onTransact;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, 127 - Color.alpha(0), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-119, -124, -114, -113, -118, -114, -118, -115, -116, -116, -117, -118, -119, -121, -123, -120, -121, -122}, (ViewConfiguration.getTouchSlop() >> 8) + 127, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-119, -124, -114, -113, -118, -114, -118, -110, -111, -116, -116, -121, -111, -118, -119, -121, -123, -120, -121, -112}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-107, -118, -114, -121, -110, -108, -110, -126, -121, -109, -116, -116, -117, -118, -119, -121, -123, -120, -121, -122}, TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr4);
        IAuthTabCallback = ((String) objArr4[0]).intern();
        Companion = new onWarmupCompleted(null);
        int i = writeTypedObject + 19;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
        int i4 = readTypedObject + 41;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintsSizeResolverExternalSyntheticLambda0IAuthTabCallback;
        }
        throw null;
    }

    @Inject
    public s3d(@NotNull findResAndMsg findresandmsg, @NotNull s5a s5aVar, @NotNull trackCheckout trackcheckout) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(s5aVar, "");
        Intrinsics.checkNotNullParameter(trackcheckout, "");
        this.IAuthTabCallbackStub = findresandmsg;
        this.onTransact = s5aVar;
        this.asInterface = trackcheckout;
        this.asBinder = LazyKt.onExtraCallbackWithResult(new MalwareAppDetectorImpl$.ExternalSyntheticLambda0());
        this.IAuthTabCallbackDefault = "";
        this.onNavigationEvent = new LinkedHashMap();
    }

    public static final /* synthetic */ s5a IAuthTabCallback(s3d s3dVar) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        s5a s5aVar = s3dVar.onTransact;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 103;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return s5aVar;
    }

    public static final /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 onExtraCallback(s3d s3dVar) {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            s3dVar.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0OnExtraCallback = s3dVar.onExtraCallback();
        int i3 = extraCallback + 77;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return constraintsSizeResolverExternalSyntheticLambda0OnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ trackCheckout onWarmupCompleted(s3d s3dVar) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 11;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        trackCheckout trackcheckout = s3dVar.asInterface;
        if (i4 != 0) {
            int i5 = 69 / 0;
        }
        int i6 = i2 + 77;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return trackcheckout;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(s3d s3dVar, PackageManager packageManager, List list) {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            s3dVar.onNavigationEvent(packageManager, list);
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = s3dVar.onNavigationEvent(packageManager, list);
        int i3 = readTypedObject + 25;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private final ConstraintsSizeResolverExternalSyntheticLambda0 onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        if (i3 != 0) {
            return (ConstraintsSizeResolverExternalSyntheticLambda0) value;
        }
        int i4 = 75 / 0;
        return (ConstraintsSizeResolverExternalSyntheticLambda0) value;
    }

    private static final ConstraintsSizeResolverExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        if (i3 != 0) {
            return ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        }
        ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 478308891;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ s3d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Context context, s3d s3dVar, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.this$0 = s3dVar;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$context, this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 25 / 0;
            return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: o.s3d$onExtraCallbackWithResult$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int[] onExtraCallbackWithResult = {2003099426, 251678200, -1828398672, -1974773883, -832534814, -1173533149, -225611812, -1703185518, -1106598924, -1535649487, -1985013752, -1694793528, 620997119, -1125169089, 1037969502, -928768116, -1210819939, 132855530};
            private static long onNavigationEvent = -5292014720122764658L;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Context $context;
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ s3d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Context context, s3d s3dVar, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
                this.this$0 = s3dVar;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$context, this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 75;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass4;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 117;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 23;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            private static void a(char[] cArr, int i, Object[] objArr) {
                int i2 = 2 % 2;
                AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i3 = $10 + 91;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onNavigationEvent ^ 5407414049857832247L);
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                }
                char[] cArr2 = new char[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                }
                String str = new String(cArr2);
                int i5 = $10 + 99;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[PHI: r3
              0x0060: PHI (r3v48 java.lang.Object) = (r3v11 java.lang.Object), (r3v50 java.lang.Object) binds: [B:8:0x002a, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00df A[Catch: Exception -> 0x041f, CancellationException -> 0x042c, WebResourceResponseModel -> 0x042f, TryCatch #2 {CancellationException -> 0x042c, Exception -> 0x041f, WebResourceResponseModel -> 0x042f, blocks: (B:16:0x0067, B:19:0x0099, B:22:0x00ba, B:25:0x00d7, B:27:0x00df, B:28:0x00ea, B:29:0x00f6, B:31:0x00fd, B:33:0x010c, B:64:0x041a, B:34:0x01da, B:35:0x01e7, B:37:0x01ed, B:39:0x01fb, B:40:0x01ff, B:43:0x020e, B:44:0x02e0, B:45:0x02eb, B:47:0x02f1, B:49:0x02fe, B:50:0x0302, B:53:0x0311, B:56:0x03ee, B:61:0x0409, B:63:0x0418, B:62:0x040d, B:11:0x0036), top: B:78:0x0016 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x010c A[Catch: Exception -> 0x041f, CancellationException -> 0x042c, WebResourceResponseModel -> 0x042f, TryCatch #2 {CancellationException -> 0x042c, Exception -> 0x041f, WebResourceResponseModel -> 0x042f, blocks: (B:16:0x0067, B:19:0x0099, B:22:0x00ba, B:25:0x00d7, B:27:0x00df, B:28:0x00ea, B:29:0x00f6, B:31:0x00fd, B:33:0x010c, B:64:0x041a, B:34:0x01da, B:35:0x01e7, B:37:0x01ed, B:39:0x01fb, B:40:0x01ff, B:43:0x020e, B:44:0x02e0, B:45:0x02eb, B:47:0x02f1, B:49:0x02fe, B:50:0x0302, B:53:0x0311, B:56:0x03ee, B:61:0x0409, B:63:0x0418, B:62:0x040d, B:11:0x0036), top: B:78:0x0016 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x01da A[Catch: Exception -> 0x041f, CancellationException -> 0x042c, WebResourceResponseModel -> 0x042f, TryCatch #2 {CancellationException -> 0x042c, Exception -> 0x041f, WebResourceResponseModel -> 0x042f, blocks: (B:16:0x0067, B:19:0x0099, B:22:0x00ba, B:25:0x00d7, B:27:0x00df, B:28:0x00ea, B:29:0x00f6, B:31:0x00fd, B:33:0x010c, B:64:0x041a, B:34:0x01da, B:35:0x01e7, B:37:0x01ed, B:39:0x01fb, B:40:0x01ff, B:43:0x020e, B:44:0x02e0, B:45:0x02eb, B:47:0x02f1, B:49:0x02fe, B:50:0x0302, B:53:0x0311, B:56:0x03ee, B:61:0x0409, B:63:0x0418, B:62:0x040d, B:11:0x0036), top: B:78:0x0016 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x03e5  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r10
              0x002c: PHI (r10v1 int) = (r10v0 int), (r10v46 int) binds: [B:8:0x002a, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r31) {
                /*
                    Method dump skipped, instructions count: 1440
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.s3d.onExtraCallbackWithResult.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            private static void b(int[] iArr, int i, Object[] objArr) {
                int i2 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = onExtraCallbackWithResult;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = $10 + 115;
                        $11 = i4 % 128;
                        if (i4 % 2 == 0) {
                            iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                        } else {
                            iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                            i3++;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = onExtraCallbackWithResult;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i5 = 0;
                    while (i5 < length3) {
                        int i6 = $10 + 63;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            iArr6[i5] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i5]);
                        } else {
                            iArr6[i5] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i5]);
                            i5++;
                        }
                        int i7 = $10 + 59;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                    int i9 = $11 + 97;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                    cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                    cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                    cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                    SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                    int i11 = 0;
                    while (i11 < 16) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                        int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                        i11++;
                        int i12 = $11 + 113;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
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
                    DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                }
                objArr[0] = new String(cArr2, 0, i);
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$context, this.this$0, null);
                this.label = 1;
                if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, anonymousClass4, this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 107;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(47 - (ViewConfiguration.getWindowTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21, new char[]{18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r'}, false, Process.getGidForName("") + 143, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = onWarmupCompleted + 103;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i5 = $11 + 79;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i7] = bindContext.access000.g(cArr2[i7], onExtraCallback);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                int i8 = $10 + 47;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                    int i10 = $11 + 35;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Context $context;
        int label;
        private static char[] onExtraCallbackWithResult = {60838, 8969, 28866, 33177, 55110, 58430, 13793, 19118, 50004, 3565, 24126, 44923, 63932, 51915, 6921, 25683, 46734, 34603, 53349, 8892, 59037, 10297, 31729, 35501, 56422, 61271, 16010, 16850, 37702, 41721, 62884, 1897, 22076, 39374, 43211, 64073, 3354, 23742, 28278, 45427, 49404, 4992, 9482, 29716, 34774, 51554, 6187, 11246, 31482, 35933, 57099, 61146, 12762, 17273, 37629, 42482, 63356, 1550, 18890, 39059, 43544, 65022, 3244, 24175, 24880, 45251, 50120, 5467, 9244, 30625, 47465, 51315, 7141, 10883, 31810, 28467, 41353, 62028, 788, 21904, 26300, 46959, 51320, 6839, 11098, 31749, 36555, 57221, 4197, 8485, 29631, 34032, 54538, 59333, 14494, 18783, 39482, 44261, 65016, 3639, 16577, 37262, 41550, 62239, 1507, 22181, 26431, 47216, 51871, 6985, 11276, 32472, 36840, 49251, 4407, 9186, 29767, 34069, 55244, 59545, 14694, 18981, 60857, 8973, 28872, 33163, 55125, 58430, 13793, 19075, 39029, 43484, 65172, 3171, 23824, 37609, 41904, 61817, 1591, 22424, 25931, 47630};
        private static long onWarmupCompleted = -2070152930485263508L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public static /* synthetic */ Unit onExtraCallback(Context context, List list, s3d s3dVar, trackEventSynchronously trackeventsynchronously) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(context, list, s3dVar, trackeventsynchronously);
            int i4 = onNavigationEvent + 117;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = s3d.this.new IAuthTabCallback(this.$context, access13800Var);
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            int i5 = onNavigationEvent + 49;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(int i, int i2, char c, Object[] objArr) {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 99;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    jArr[i5] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onExtraCallbackWithResult[i % i5]), i5, onWarmupCompleted, c);
                } else {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onExtraCallbackWithResult[i + i6]), i6, onWarmupCompleted, c);
                }
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
            }
            String str = new String(cArr);
            int i7 = $10 + 81;
            $11 = i7 % 128;
            if (i7 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static final Unit IAuthTabCallback(Context context, List list, s3d s3dVar, trackEventSynchronously trackeventsynchronously) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = context.getString(R.string.security_impl_dlg_title_hacking_app_notice);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            trackeventsynchronously.onExtraCallbackWithResult(str);
            Object[] objArr = {trackeventsynchronously, context.getString(R.string.security_impl_dlg_message_hacking_app_notice)};
            trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            Intent intentOnWarmupCompleted = s3dVar.onWarmupCompleted(context);
            Object[] objArr2 = new Object[1];
            a(ViewConfiguration.getWindowTouchSlop() >> 8, 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(7 - MotionEvent.axisFromString(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, (char) (12014 - View.MeasureSpec.getSize(0)), objArr3);
            intentOnWarmupCompleted.putExtra(strIntern, ((String) objArr3[0]).intern());
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1927846129, iOnExtraCallbackWithResult, -1927846128, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously, intentOnWarmupCompleted}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
            trackeventsynchronously.onNavigationEvent(5);
            trackeventsynchronously.onWarmupCompleted(NativeCrashReporter.DEFAULT.getPattern());
            Object[] objArr4 = new Object[1];
            a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20, 55 - KeyEvent.normalizeMetaState(0), (char) (2849 - (ViewConfiguration.getTapTimeout() >> 16)), objArr4);
            trackeventsynchronously.IAuthTabCallback(((String) objArr4[0]).intern());
            trackeventsynchronously.onNavigationEvent(true);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                s5a s5aVarIAuthTabCallback = s3d.IAuthTabCallback(s3d.this);
                Context context = this.$context;
                this.label = 1;
                obj = s5aVarIAuthTabCallback.onNavigationEvent(context, false, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(74 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 46 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33411), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i3 = onNavigationEvent + 121;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = IAuthTabCallback + 63;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) obj) {
                int i6 = onNavigationEvent + 49;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (((s7) obj3).onTransact()) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                trackCheckout trackcheckoutOnWarmupCompleted = s3d.onWarmupCompleted(s3d.this);
                Object[] objArr2 = new Object[1];
                a(121 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
                trackcheckoutOnWarmupCompleted.onWarmupCompleted(((String) objArr2[0]).intern(), 302, new MalwareAppDetectorImpl$showSuspiciousNotification$1$.ExternalSyntheticLambda0(this.$context, arrayList, s3d.this));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.s8ExternalSyntheticLambda2
    public Object onExtraCallbackWithResult(@NotNull Context context, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallbackStub, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(context, this, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallback + 43;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean onNavigationEvent(PackageManager packageManager, List<? extends PackageInfo> list) {
        int i = 2 % 2;
        List<? extends PackageInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (PackageInfo packageInfo : list2) {
            String str = packageInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "");
            arrayList.add(new s5d(str, packageInfo.firstInstallTime, packageInfo.lastUpdateTime, packageInfo));
        }
        List<s5d> listOnExtraCallback = s5e.onExtraCallback(arrayList);
        String str2 = this.IAuthTabCallbackDefault;
        String strOnExtraCallbackWithResult = s5e.onExtraCallbackWithResult(listOnExtraCallback);
        if (Intrinsics.areEqual(str2, strOnExtraCallbackWithResult)) {
            int i2 = extraCallback + 27;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        this.IAuthTabCallbackDefault = strOnExtraCallbackWithResult;
        List<s5d> list3 = listOnExtraCallback;
        HashSet hashSet = new HashSet();
        Iterator<T> it = list3.iterator();
        while (!(!it.hasNext())) {
            int i4 = readTypedObject + 97;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            s5d s5dVar = (s5d) it.next();
            hashSet.add(getWrite.IAuthTabCallback(s5dVar.IAuthTabCallback(), Long.valueOf(s5dVar.onExtraCallbackWithResult())));
        }
        this.onNavigationEvent.keySet().retainAll(hashSet);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (s5d s5dVar2 : list3) {
            int i6 = extraCallback + 117;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            arrayList2.add(onExtraCallback.Companion.onWarmupCompleted(s5dVar2.onWarmupCompleted(), onWarmupCompleted(packageManager, s5dVar2.onWarmupCompleted())));
        }
        String strOnNavigationEvent = getEmbedViewManager.onNavigationEvent(arrayList2);
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-107, -118, -114, -121, -110, -108, -110, -126, -121, -109, -116, -116, -117, -118, -119, -121, -123, -120, -121, -122}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-115, -105, -118, -126, -108, -106, -118, -110, -108, -123}, 126 - TextUtils.lastIndexOf("", '0', 0), objArr2);
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, strIntern, strOnNavigationEvent, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), onExtraCallback().asBinder())), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i8 = extraCallback + 33;
        readTypedObject = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    @Override // o.s8ExternalSyntheticLambda2
    public void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null))), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(context, null), 3, (Object) null);
        int i2 = extraCallback + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.s8ExternalSyntheticLambda2
    public void IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        NotificationManager notificationManager = (NotificationManager) ContextCompat.getSystemService(context, NotificationManager.class);
        if (notificationManager != null) {
            int i2 = extraCallback + 119;
            readTypedObject = i2 % 128;
            notificationManager.cancel(i2 % 2 != 0 ? 7619 : 302);
            int i3 = extraCallback + 61;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = readTypedObject + 11;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final C0004onExtraCallback Companion;
        private static int IAuthTabCallbackDefault = 0;
        private static boolean IAuthTabCallbackStub = false;
        private static int IAuthTabCallback_Parcel = 0;
        private static int access000 = 1;
        private static boolean asBinder = false;
        private static int asInterface = 0;
        private static char[] onExtraCallback = null;
        private static int onTransact = 1;

        @SerializedName("appName")
        private final String IAuthTabCallback;

        @SerializedName("firstInstallTime")
        private final long onExtraCallbackWithResult;

        @SerializedName("packageName")
        private final String onNavigationEvent;

        @SerializedName("lastUpdateTime")
        private final long onWarmupCompleted;

        static {
            IAuthTabCallback();
            Companion = new C0004onExtraCallback(null);
            int i = asInterface + 27;
            onTransact = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = access000 + 11;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                int i4 = IAuthTabCallback_Parcel + 117;
                access000 = i4 % 128;
                return i4 % 2 == 0;
            }
            if (this.onExtraCallbackWithResult == onextracallback.onExtraCallbackWithResult) {
                return this.onWarmupCompleted == onextracallback.onWarmupCompleted;
            }
            int i5 = IAuthTabCallback_Parcel + 67;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access000 + 69;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.onNavigationEvent.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + Long.hashCode(this.onExtraCallbackWithResult)) * 31) + Long.hashCode(this.onWarmupCompleted);
            int i4 = IAuthTabCallback_Parcel + 77;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = this.onNavigationEvent;
            String str2 = this.IAuthTabCallback;
            long j = this.onExtraCallbackWithResult;
            long j2 = this.onWarmupCompleted;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            Object obj = null;
            a(null, null, new byte[]{-107, -122, -108, -126, -109, -122, -110, -126, -111, -112, -126, -120, -113, -114, -122, -115, -126, -117, -116, -117, -118, -126, -119, -120, -120, -121, -122, -123, -126, -124, -125, -126, -127}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-107, -122, -108, -126, -109, -120, -120, -126, -105, -106}, 127 - Drawable.resolveOpacity(0, 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str2);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-107, -122, -108, -116, -102, -125, -125, -126, -115, -114, -118, -103, -115, -114, -123, -116, -104, -105, -106}, 127 - KeyEvent.getDeadChar(0, 0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(j);
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-107, -122, -108, -116, -102, -122, -115, -126, -117, -120, -101, -115, -114, -126, -125, -105, -106}, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(j2);
            Object[] objArr5 = new Object[1];
            a(null, null, new byte[]{-100}, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
            sb.append(((String) objArr5[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallback_Parcel + 39;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = $11 + 111;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr3[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i3]);
                }
                cArr2 = cArr3;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(IAuthTabCallbackDefault);
            if (!(!IAuthTabCallbackStub)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (asBinder) {
                int i6 = $10 + 21;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr6);
            int i8 = $10 + 105;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2, long j, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = str2;
            this.onExtraCallbackWithResult = j;
            this.onWarmupCompleted = j2;
        }

        static void IAuthTabCallback() {
            onExtraCallback = new char[]{32568, 32556, 32601, 32598, 32595, 32544, 32524, 32605, 32514, 32607, 32545, 32548, 32593, 32594, 32741, 32546, 32602, 32550, 32575, 32600, 32520, 32537, 32749, 32551, 32516, 32561, 32560, 32740};
            IAuthTabCallbackDefault = -1184333875;
            asBinder = true;
            IAuthTabCallbackStub = true;
        }

        /* renamed from: o.s3d$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0004onExtraCallback {
            static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(C0004onExtraCallback.class);

            public /* synthetic */ C0004onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0004onExtraCallback() {
            }

            public final onExtraCallback onWarmupCompleted(@NotNull PackageInfo packageInfo, @NotNull String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
                if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 1) & 1) == 0) {
                    Intrinsics.checkNotNullParameter(packageInfo, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    String str2 = packageInfo.packageName;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(packageInfo, "");
                Intrinsics.checkNotNullParameter(str, "");
                String str3 = packageInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                onExtraCallback onextracallback = new onExtraCallback(str3, str, packageInfo.firstInstallTime, packageInfo.lastUpdateTime);
                int i3 = onWarmupCompleted;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
                if ((((((~i3) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i3)) >> 17) & 1) == 0) {
                    int i4 = 39 / 0;
                }
                return onextracallback;
            }
        }
    }

    @Override // o.s8ExternalSyntheticLambda2
    public Intent onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intent intentOnExtraCallback = ((MalwareDetectActivity$onNavigationEvent) MalwareDetectActivity.Companion).onExtraCallback(context);
        Object[] objArr = new Object[1];
        b(false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1}, new int[]{0, 8, 136, 8}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126, -124, -108, -114, -121, -113, -108, -104, -108, -114, -124, -126}, View.resolveSizeAndState(0, 0, 0) + 127, objArr2);
        intentOnExtraCallback.putExtra(strIntern, ((String) objArr2[0]).intern());
        int i4 = extraCallback + 79;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return intentOnExtraCallback;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = getInterfaceDescriptor;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $10 + 13;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr3[i4] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i4]);
            }
            cArr2 = cArr3;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(IAuthTabCallbackStubProxy);
        if (access100) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 101;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] - iY);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                }
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (access000) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 5;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $11 + 59;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] / iY);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String onWarmupCompleted(android.content.pm.PackageManager r7, android.content.pm.PackageInfo r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r8.packageName
            long r2 = r8.lastUpdateTime
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            kotlin.Pair r1 = o.getWrite.IAuthTabCallback(r1, r2)
            java.util.Map<kotlin.Pair<java.lang.String, java.lang.Long>, java.lang.String> r2 = r6.onNavigationEvent
            java.lang.Object r3 = r2.get(r1)
            if (r3 != 0) goto L88
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L60
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2c
            java.lang.CharSequence r7 = r8.loadLabel(r7)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)     // Catch: java.lang.Throwable -> L2c
            goto L37
        L2c:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
        L37:
            boolean r8 = kotlin.Result.onExtraCallback(r7)
            if (r8 == r3) goto L3e
            goto L3f
        L3e:
            r7 = r4
        L3f:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L60
            int r8 = o.s3d.readTypedObject
            int r8 = r8 + 31
            int r5 = r8 % 128
            o.s3d.extraCallback = r5
            int r8 = r8 % r0
            if (r8 == 0) goto L59
            boolean r8 = kotlin.text.StringsKt.isBlank(r7)
            if (r8 != 0) goto L55
            goto L56
        L55:
            r7 = r4
        L56:
            if (r7 != 0) goto L84
            goto L60
        L59:
            kotlin.text.StringsKt.isBlank(r7)
            r4.hashCode()
            throw r4
        L60:
            r7 = 7
            byte[] r7 = new byte[r7]
            r7 = {x008c: FILL_ARRAY_DATA , data: [-126, -123, -124, -126, -125, -126, -127} // fill-array
            int r8 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r8 = r8 >> 16
            int r8 = 127 - r8
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r4, r4, r7, r8, r5)
            r7 = 0
            r7 = r5[r7]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r7.intern()
            int r8 = o.s3d.extraCallback
            int r8 = r8 + r3
            int r3 = r8 % 128
            o.s3d.readTypedObject = r3
            int r8 = r8 % r0
        L84:
            r3 = r7
            r2.put(r1, r3)
        L88:
            java.lang.String r3 = (java.lang.String) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s3d.onWarmupCompleted(android.content.pm.PackageManager, android.content.pm.PackageInfo):java.lang.String");
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback_Parcel;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $11 + 21;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
            }
            int i9 = $10 + 21;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = $10 + 107;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                        throw null;
                    }
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            int i12 = $10 + 27;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        getInterfaceDescriptor = new char[]{32621, 32628, 32631, 32619, 32611, 32597, 32633, 32630, 32616, 32637, 32601, 32618, 32606, 32622, 32639, 32629, 32635, 32638, 32607, 32625, 32623, 32620, 32593, 32636};
        IAuthTabCallbackStubProxy = -1184334054;
        access000 = true;
        access100 = true;
        IAuthTabCallback_Parcel = new char[]{27187, 27325, 27299, 27299, 27325, 27316, 27325, 27325};
    }
}
