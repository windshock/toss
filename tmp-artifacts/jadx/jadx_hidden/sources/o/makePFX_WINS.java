package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatDialog;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.R;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.EngineConfig1;
import o.bindContext;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.dev.TossCertQrSignDevTool$;

/* loaded from: classes.dex */
public final class makePFX_WINS {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(makePFX_WINS.class);
    public static final makePFX_WINS onNavigationEvent = new makePFX_WINS();

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i));
        int i11 = ~(i9 | i3);
        int i12 = i10 | i11;
        int i13 = ~i;
        int i14 = i11 | (~(i13 | i3));
        int i15 = (~(i6 | i7 | i13)) | (~(i13 | i9 | i3));
        int i16 = i + i3 + i4 + ((-1369571145) * i2) + ((-720088171) * i5);
        int i17 = i16 * i16;
        int i18 = (((-954023988) * i) - 252706816) + ((-260227018) * i3) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i4) + (565182464 * i2) + (1611661312 * i5) + ((-409206784) * i17);
        int i19 = ((i * (-1931095572)) - 2087550970) + (i3 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i4 * (-1931095207)) + (i2 * (-789048161)) + (i5 * 356376013) + (i17 * 423362560);
        int i20 = i18 + (i19 * i19 * (-1901854720));
        return i20 != 1 ? i20 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
        onExtraCallback(function1, booleanRef, dialogInterface);
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
        int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 1) & 1;
        Object obj = null;
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private makePFX_WINS() {
    }

    public static final class onNavigationEvent extends AppCompatDialog {
        static int onTransact = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
        final /* synthetic */ Context IAuthTabCallback;
        final /* synthetic */ Ref.BooleanRef IAuthTabCallbackStub;
        final /* synthetic */ String asBinder;
        final /* synthetic */ String asInterface;
        final /* synthetic */ String onExtraCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ String onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = i4 | i5 | i2;
            int i8 = (~((~i2) | i5)) | i4;
            int i9 = ~((~i4) | i5);
            int i10 = i4 + i5 + i + (1132004924 * i6) + ((-2047965933) * i3);
            int i11 = i10 * i10;
            int i12 = ((1650805025 * i4) - 289800192) + ((-1513965855) * i5) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i) + (1823473664 * i6) + (830210048 * i3) + ((-1143341056) * i11);
            int i13 = ((i4 * (-767560105)) - 1188649921) + (i5 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i * (-767559561)) + (i6 * 1544553956) + (i3 * (-1468578859)) + (i11 * (-2108293120));
            int i14 = i12 + (i13 * i13 * (-2075787264));
            return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? i14 != 5 ? IAuthTabCallback(objArr) : onTransact(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[1];
            View view = (View) objArr[2];
            int i = 2 % 2;
            int i2 = onTransact;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if ((1 & (((i4 & i3) | (i3 ^ i4)) >> 30)) != 0) {
                return onNavigationEvent(booleanRef, onnavigationevent, view);
            }
            onNavigationEvent(booleanRef, onnavigationevent, view);
            throw null;
        }

        private static /* synthetic */ Object onTransact(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            View view = (View) objArr[1];
            int i = 2 % 2;
            int i2 = onTransact;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            int i5 = 1 & (((i4 & i3) | (i3 ^ i4)) >> 20);
            onNavigationEvent(onnavigationevent, view);
            if (i5 == 0) {
                int i6 = 51 / 0;
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4267);
            return null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            resumeForClick resumeforclick = (resumeForClick) objArr[0];
            String str = (String) objArr[1];
            Context context = (Context) objArr[2];
            TdsTextButtonV0View tdsTextButtonV0View = (TdsTextButtonV0View) objArr[3];
            View view = (View) objArr[4];
            int i = 2 % 2;
            int i2 = onTransact;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1212);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            int i5 = (((i4 & i3) | (i3 ^ i4)) >> 21) & 1;
            onWarmupCompleted(resumeforclick, str, context, tdsTextButtonV0View, view);
            if (i5 == 0) {
                int i6 = 31 / 0;
            }
            int i7 = onTransact;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
            if (((((i7 | iOnWarmupCompleted2) & (~(i7 & iOnWarmupCompleted2))) >> 15) & 1) == 0) {
                int i8 = 47 / 0;
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, String str, String str2, String str3, String str4, String str5, String str6, Ref.BooleanRef booleanRef, int i) {
            super(context, i);
            this.IAuthTabCallback = context;
            this.onExtraCallbackWithResult = str;
            this.asInterface = str2;
            int i2 = onTransact;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
            int i3 = i2 & iOnWarmupCompleted;
            if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 22) & 1) == 0) {
                this.onWarmupCompleted = str3;
                this.asBinder = str4;
                throw null;
            }
            this.onWarmupCompleted = str3;
            this.asBinder = str4;
            int i4 = onTransact;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5782);
            if (((((i4 | iOnWarmupCompleted2) & (~(i4 & iOnWarmupCompleted2))) >> 2) & 1) != 0) {
                this.onNavigationEvent = str5;
                this.onExtraCallback = str6;
                this.IAuthTabCallbackStub = booleanRef;
                throw null;
            }
            this.onNavigationEvent = str5;
            this.onExtraCallback = str6;
            this.IAuthTabCallbackStub = booleanRef;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
            onnavigationevent.dismiss();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
            return null;
        }

        /* renamed from: o.makePFX_WINS$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0003onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static final byte[] $$a;
            private static final int $$b = 17;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallbackWithResult;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            final /* synthetic */ CRYPT_ECDHKeyAgreement $binding;
            final /* synthetic */ String $qrContent;
            int label;

            private static String $$c(int i, byte b, byte b2) {
                byte[] bArr = $$a;
                int i2 = i * 2;
                int i3 = (b * 2) + 102;
                int i4 = 3 - (b2 * 4);
                byte[] bArr2 = new byte[i2 + 11];
                int i5 = i2 + 10;
                int i6 = -1;
                if (bArr == null) {
                    i3 = i5 + i3 + 2;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i3;
                    if (i6 == i5) {
                        return new String(bArr2, 0);
                    }
                    i4++;
                    i3 = i3 + bArr[i4] + 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0003onNavigationEvent(CRYPT_ECDHKeyAgreement cRYPT_ECDHKeyAgreement, String str, access13800<? super C0003onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.$binding = cRYPT_ECDHKeyAgreement;
                this.$qrContent = str;
            }

            public static native void k(Object obj, int i, int i2);

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                C0003onNavigationEvent c0003onNavigationEventCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return c0003onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
                }
                c0003onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0003onNavigationEvent c0003onNavigationEvent = new C0003onNavigationEvent(this.$binding, this.$qrContent, access13800Var);
                int i2 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return c0003onNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            /* renamed from: o.makePFX_WINS$onNavigationEvent$onNavigationEvent$onExtraCallbackWithResult */
            static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static char[] onNavigationEvent = {27220, 27262, 27162, 27184, 27161, 27165, 27191, 27197, 27169, 27199, 27192, 27190, 27189, 27343, 27185, 27187, 27187, 27192, 27136, 27167, 27189, 27189, 27187, 27158, 27262, 27165, 27195, 27188, 27185, 27185, 27190, 27163, 27262, 27137, 27190, 27187, 27193, 27196, 27198, 27136, 27262, 27165, 27192, 27184, 27343, 27191, 27190};
                final /* synthetic */ String $qrContent;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                onExtraCallbackWithResult(String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
                    super(2, access13800Var);
                    this.$qrContent = str;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$qrContent, access13800Var);
                    int i2 = IAuthTabCallback + 9;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 97 / 0;
                    }
                    return onextracallbackwithresult;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Bitmap> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return onNavigationEvent(findresandmsg, access13800Var);
                    }
                    onNavigationEvent(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 67;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallbackWithResult + 75;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    if (this.label != 0) {
                        Object[] objArr = new Object[1];
                        a(new int[]{0, 47, 13, 9}, true, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1}, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                    getDynamic getdynamic = getDynamic.onWarmupCompleted;
                    String str = this.$qrContent;
                    Integer numOnNavigationEvent = access14000.onNavigationEvent(250);
                    followRedirects followredirects = followRedirects.onExtraCallbackWithResult;
                    int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3)).getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    int iOnNavigationEvent = varyMatches.onNavigationEvent(numOnNavigationEvent, displayMetrics);
                    Integer numOnNavigationEvent2 = access14000.onNavigationEvent(250);
                    int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    DisplayMetrics displayMetrics2 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted5, iOnWarmupCompleted4, iOnWarmupCompleted6)).getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                    Bitmap bitmapOnExtraCallback = getdynamic.onExtraCallback(str, iOnNavigationEvent, varyMatches.onNavigationEvent(numOnNavigationEvent2, displayMetrics2));
                    int i3 = onExtraCallbackWithResult + 39;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return bitmapOnExtraCallback;
                }

                private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
                    char[] cArr;
                    int i = 2 % 2;
                    TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr2 = onNavigationEvent;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            cArr3[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i6]);
                        }
                        cArr2 = cArr3;
                    }
                    char[] cArr4 = new char[i3];
                    System.arraycopy(cArr2, i2, cArr4, 0, i3);
                    if (bArr != null) {
                        int i7 = $10 + 65;
                        $11 = i7 % 128;
                        if (i7 % 2 == 0) {
                            cArr = new char[i3];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                        } else {
                            cArr = new char[i3];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        }
                        char c = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                            if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                                int i8 = $10 + 65;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                            } else {
                                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                            }
                            c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                            Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
                        }
                        int i10 = $10 + 23;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4 = cArr;
                    }
                    if (i5 > 0) {
                        char[] cArr5 = new char[i3];
                        System.arraycopy(cArr4, 0, cArr5, 0, i3);
                        int i12 = i3 - i5;
                        System.arraycopy(cArr5, 0, cArr4, i12, i5);
                        System.arraycopy(cArr5, i5, cArr4, 0, i12);
                        int i13 = $11 + 23;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 3 / 4;
                        }
                    }
                    if (z) {
                        int i15 = $11 + 35;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        char[] cArr6 = new char[i3];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                            int i17 = $10 + 97;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                            cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                            trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                        }
                        cArr4 = cArr6;
                    }
                    if (i4 > 0) {
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                            cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                            trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                            int i19 = $10 + 9;
                            $11 = i19 % 128;
                            if (i19 % 2 == 0) {
                                int i20 = 5 % 2;
                            }
                        }
                    }
                    objArr[0] = new String(cArr4);
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallbackWithResult + 21;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        Object[] objArr = new Object[1];
                        a(46 - ExpandableListView.getPackedPositionChild(0L), 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{'\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483}, false, (ViewConfiguration.getScrollBarSize() >> 8) + 248, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    ProgressBar progressBar = this.$binding.onExtraCallback;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "");
                    progressBar.setVisibility(0);
                    GeckoHubImp geckoHubImpOnWarmupCompleted = putChannelInfo.onWarmupCompleted();
                    Object obj2 = null;
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$qrContent, null);
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpOnWarmupCompleted, onextracallbackwithresult, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 97;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }
                this.$binding.IAuthTabCallback.setImageBitmap((Bitmap) obj);
                ProgressBar progressBar2 = this.$binding.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "");
                progressBar2.setVisibility(4);
                return Unit.INSTANCE;
            }

            private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
                int i4 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                    int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    cArr2[i5] = bindContext.access000.g(cArr2[i5], onNavigationEvent);
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                    int i6 = $11 + 77;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
                    int i8 = $10 + 25;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            static {
                byte[] bArr = {121, -58, 81, 67, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
                $$a = bArr;
                ClassLoader parent = C0003onNavigationEvent.class.getClassLoader().getParent();
                try {
                    byte b = (byte) (bArr[4] - 1);
                    byte b2 = b;
                    Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                    declaredMethod.setAccessible(true);
                    System.load((String) declaredMethod.invoke(parent, "ea56"));
                    onExtraCallbackWithResult = 0;
                    onWarmupCompleted = 1;
                    onNavigationEvent = 478309045;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r20) {
            /*
                Method dump skipped, instructions count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.makePFX_WINS.onNavigationEvent.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00e4 A[PHI: r8
          0x00e4: PHI (r8v10 android.content.Context) = (r8v9 android.content.Context), (r8v14 android.content.Context) binds: [B:12:0x00e2, B:9:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00ed A[PHI: r8
          0x00ed: PHI (r8v13 android.content.Context) = (r8v9 android.content.Context), (r8v10 android.content.Context), (r8v14 android.content.Context) binds: [B:12:0x00e2, B:14:0x00e8, B:9:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCreate(android.os.Bundle r14) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.makePFX_WINS.onNavigationEvent.onCreate(android.os.Bundle):void");
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[1];
            View view = (View) objArr[2];
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
            Intrinsics.checkNotNullParameter(view, "");
            booleanRef.element = true;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3276);
            onnavigationevent.dismiss();
            Unit unit = Unit.INSTANCE;
            int i2 = onTransact;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
            if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 25) & 1) != 0) {
                int i3 = 95 / 0;
            }
            return unit;
        }

        public static /* synthetic */ void onWarmupCompleted(onNavigationEvent onnavigationevent, View view) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            onExtraCallback(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{onnavigationevent, view}, 114928030, -114928025, iOnExtraCallbackWithResult3);
        }

        public static /* synthetic */ void onExtraCallback(resumeForClick resumeforclick, String str, Context context, TdsTextButtonV0View tdsTextButtonV0View, View view) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            onExtraCallback(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{resumeforclick, str, context, tdsTextButtonV0View, view}, 1007398482, -1007398480, iOnExtraCallbackWithResult3);
        }

        public static /* synthetic */ Unit onWarmupCompleted(Ref.BooleanRef booleanRef, onNavigationEvent onnavigationevent, View view) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{booleanRef, onnavigationevent, view}, 2075544587, -2075544584, iOnExtraCallbackWithResult3);
        }

        private static final void onNavigationEvent(onNavigationEvent onnavigationevent, View view) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            onExtraCallback(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{onnavigationevent, view}, -1641530543, 1641530544, iOnExtraCallbackWithResult3);
        }

        private static final void onWarmupCompleted(resumeForClick resumeforclick, String str, Context context, TdsTextButtonV0View tdsTextButtonV0View, View view) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            onExtraCallback(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{resumeforclick, str, context, tdsTextButtonV0View, view}, 582885138, -582885138, iOnExtraCallbackWithResult3);
        }

        private static final Unit onNavigationEvent(Ref.BooleanRef booleanRef, onNavigationEvent onnavigationevent, View view) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult(), new Object[]{booleanRef, onnavigationevent, view}, 63289852, -63289848, iOnExtraCallbackWithResult3);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 1) & 1) == 0) {
            function1.invoke(Boolean.valueOf(booleanRef.element));
            throw null;
        }
        function1.invoke(Boolean.valueOf(booleanRef.element));
        int i4 = onExtraCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5320);
        if ((((((~i4) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i4)) >> 29) & 1) != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        String str6 = (String) objArr[7];
        Function1 function1 = (Function1) objArr[8];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5772);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 22) & 1) != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = 69 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i5 = onExtraCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
        if (((((i5 | iOnWarmupCompleted2) & (~(i5 & iOnWarmupCompleted2))) >> 15) & 1) != 0) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AppCompatDialog onnavigationevent = new onNavigationEvent(context, str3, str, str2, str6, str4, str5, booleanRef, R.style.WhiteTheme);
        onnavigationevent.setOnDismissListener(new TossCertQrSignDevTool$.ExternalSyntheticLambda0(function1, booleanRef));
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
        onnavigationevent.show();
        int i6 = onExtraCallback;
        int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
        if ((1 & (((i6 | iOnWarmupCompleted3) & (~(i6 & iOnWarmupCompleted3))) >> 2)) == 0) {
            return null;
        }
        int i7 = 68 / 0;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Ref.BooleanRef booleanRef, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        onExtraCallbackWithResult(1610638329, MaxNativeAdListener.onExtraCallbackWithResult(), -1610638329, iOnExtraCallbackWithResult2, new Object[]{function1, booleanRef, dialogInterface}, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallback(Function1 function1, Ref.BooleanRef booleanRef, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-699184472, MaxNativeAdListener.onExtraCallbackWithResult(), 699184474, iOnExtraCallbackWithResult2, new Object[]{function1, booleanRef, dialogInterface}, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Function1<? super Boolean, Unit> function1) {
        Object[] objArr = {this, context, str, str2, str3, str4, str5, str6, function1};
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-1149909866, MaxNativeAdListener.onExtraCallbackWithResult(), 1149909867, MaxNativeAdListener.onExtraCallbackWithResult(), objArr, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
