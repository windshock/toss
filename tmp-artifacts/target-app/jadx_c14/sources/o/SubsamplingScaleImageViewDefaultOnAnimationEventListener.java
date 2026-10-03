package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.SubsamplingScaleImageViewDefaultOnAnimationEventListener;
import o.setAdUnitIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubsamplingScaleImageViewDefaultOnAnimationEventListener implements isApplicationPaused {
    private final onImageLoadError IAuthTabCallback;
    private final getCenter onExtraCallback;
    private final MaxAdViewImplc onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted = {60861, 27279, 58314, 30756, 61811, 18862, 35937, 2899, 33302, 6648, 37039, 10354, 42779, 15883, 46546, 19644, 50284, 17198, 55808, 20956};
    private static long IAuthTabCallbackDefault = 42963345620167393L;

    private static String $$c(short s, byte b, short s2) {
        int i = s * 4;
        int i2 = 3 - (b * 4);
        byte[] bArr = $$a;
        int i3 = 97 - (s2 * 4);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (-i3) + i;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            i2++;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i2]) + i3;
            i4 = i5;
        }
    }

    public static /* synthetic */ setAdUnitIds IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public SubsamplingScaleImageViewDefaultOnAnimationEventListener(@NotNull MaxAdViewImplc maxAdViewImplc, @NotNull onImageLoadError onimageloaderror, @NotNull getCenter getcenter) {
        Intrinsics.checkNotNullParameter(maxAdViewImplc, "");
        Intrinsics.checkNotNullParameter(onimageloaderror, "");
        Intrinsics.checkNotNullParameter(getcenter, "");
        this.onExtraCallbackWithResult = maxAdViewImplc;
        this.IAuthTabCallback = onimageloaderror;
        this.onExtraCallback = getcenter;
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.intoss.AppsInTossDeepLinkUriHandler$$ExternalSyntheticLambda0
            public final Object invoke() {
                return SubsamplingScaleImageViewDefaultOnAnimationEventListener.IAuthTabCallback();
            }
        });
    }

    public static final /* synthetic */ getCenter onExtraCallback(SubsamplingScaleImageViewDefaultOnAnimationEventListener subsamplingScaleImageViewDefaultOnAnimationEventListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        getCenter getcenter = subsamplingScaleImageViewDefaultOnAnimationEventListener.onExtraCallback;
        int i5 = i3 + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return getcenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ MaxAdViewImplc onNavigationEvent(SubsamplingScaleImageViewDefaultOnAnimationEventListener subsamplingScaleImageViewDefaultOnAnimationEventListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MaxAdViewImplc maxAdViewImplc = subsamplingScaleImageViewDefaultOnAnimationEventListener.onExtraCallbackWithResult;
        if (i3 != 0) {
            return maxAdViewImplc;
        }
        throw null;
    }

    public static final /* synthetic */ onImageLoadError onWarmupCompleted(SubsamplingScaleImageViewDefaultOnAnimationEventListener subsamplingScaleImageViewDefaultOnAnimationEventListener) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 83;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onImageLoadError onimageloaderror = subsamplingScaleImageViewDefaultOnAnimationEventListener.IAuthTabCallback;
        int i5 = i2 + 5;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return onimageloaderror;
        }
        throw null;
    }

    public /* bridge */ boolean onWarmupCompleted(@NotNull Context context, @Nullable Uri uri, boolean z, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.onWarmupCompleted(context, uri, z, bundle);
        }
        super.onWarmupCompleted(context, uri, z, bundle);
        throw null;
    }

    public final setAdUnitIds onExtraCallback() {
        setAdUnitIds setadunitids;
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            setadunitids = (setAdUnitIds) this.onNavigationEvent.getValue();
            int i3 = 58 / 0;
        } else {
            setadunitids = (setAdUnitIds) this.onNavigationEvent.getValue();
        }
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return setadunitids;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final setAdUnitIds onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            return ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
        }
        Response response2 = Response.onNavigationEvent;
        ((setAdUnitIds.onExtraCallbackWithResult) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), setAdUnitIds.onExtraCallbackWithResult.class)).Rcolor();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewDefaultOnAnimationEventListener.a(int, int, char, java.lang.Object[]):void");
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $aitAttributionContext;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $deploymentId;
        final /* synthetic */ boolean $isPrivate;
        final /* synthetic */ Ref.BooleanRef $isSuccess;
        final /* synthetic */ String $navigationMissionContext;
        final /* synthetic */ Ref.ObjectRef<Uri> $newUri;
        final /* synthetic */ String $scheme;
        final /* synthetic */ String $service;
        final /* synthetic */ boolean $setForwardResultFlag;
        final /* synthetic */ Uri $uri;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SubsamplingScaleImageViewDefaultOnAnimationEventListener this$0;
        private static final byte[] $$a = {117, -24, -14, 98};
        private static final int $$b = 55;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallback = 1;
        private static long onNavigationEvent = 7798559133331975163L;
        private static int onExtraCallbackWithResult = -1776194565;
        private static char onWarmupCompleted = 1482;

        private static String $$c(byte b, int i, short s) {
            byte[] bArr = $$a;
            int i2 = i * 3;
            int i3 = s + 109;
            int i4 = 4 - (b * 4);
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            int i6 = -1;
            if (bArr == null) {
                i3 += i5;
                i4++;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i4];
                i4++;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, SubsamplingScaleImageViewDefaultOnAnimationEventListener subsamplingScaleImageViewDefaultOnAnimationEventListener, String str, String str2, Context context, Ref.BooleanRef booleanRef, Ref.ObjectRef<Uri> objectRef, String str3, Uri uri, boolean z2, String str4, String str5, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$isPrivate = z;
            this.this$0 = subsamplingScaleImageViewDefaultOnAnimationEventListener;
            this.$service = str;
            this.$deploymentId = str2;
            this.$context = context;
            this.$isSuccess = booleanRef;
            this.$newUri = objectRef;
            this.$scheme = str3;
            this.$uri = uri;
            this.$setForwardResultFlag = z2;
            this.$aitAttributionContext = str4;
            this.$navigationMissionContext = str5;
        }

        public static /* synthetic */ void onNavigationEvent(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback(dialogInterface, i);
            int i5 = onExtraCallback + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$isPrivate, this.this$0, this.$service, this.$deploymentId, this.$context, this.$isSuccess, this.$newUri, this.$scheme, this.$uri, this.$setForwardResultFlag, this.$aitAttributionContext, this.$navigationMissionContext, access13800Var);
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 56 / 0;
            } else {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
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
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i5 = $10 + 7;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char mode = (char) View.MeasureSpec.getMode(i4);
                        int i7 = 44 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i8 = 1451 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b = (byte) i4;
                        byte b2 = b;
                        String str$$c = $$c(b, b2, (byte) (b2 + 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, i7, i8, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char fadingEdgeLength = (char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44;
                        int edgeSlop = 1494 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b3 = (byte) i4;
                        byte b4 = b3;
                        String str$$c2 = $$c(b3, b4, b4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, i9, edgeSlop, 1533236389, false, str$$c2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i10);
                    objArr4[i4] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        char cRgb = (char) ((-16753244) - Color.rgb(i4, i4, i4));
                        int keyRepeatDelay = 50 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 22940;
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i4] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, keyRepeatDelay, packedPositionChild, 1872485556, false, "k", clsArr3);
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i4] = Integer.valueOf(i11);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i4) + 45849);
                        int iLastIndexOf = 28 - TextUtils.lastIndexOf("", '0', i4);
                        int iLastIndexOf2 = 12576 - TextUtils.lastIndexOf("", '0', i4);
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i4] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iLastIndexOf, iLastIndexOf2, 1401536470, false, "l", clsArr4);
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i12 = $11 + 95;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i2 = 2;
                    i4 = 0;
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

        private static final void IAuthTabCallback(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            dialogInterface.dismiss();
            if (i4 != 0) {
                int i5 = 64 / 0;
            }
            int i6 = IAuthTabCallback + 39;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(25:0|2|156|(1:(1:(17:6|159|7|8|158|48|72|(1:74)|75|(2:77|(1:(15:81|(1:83)(1:84)|85|(1:87)(1:(2:89|(1:91)(2:92|93))(1:94))|95|(1:106)(2:99|(2:101|(0))(2:104|105))|107|(1:113)|114|(1:120)|121|(1:123)|(1:(1:131))(1:129)|132|133))(2:134|135))|(2:139|(2:141|(1:143))(2:144|145))|146|(1:148)|149|(1:153)|154|155)(2:15|16))(1:17))(2:18|(1:20)(16:26|27|(1:29)(1:30)|31|161|32|(1:39)(1:38)|40|41|165|42|43|163|44|(14:47|158|48|72|(0)|75|(0)|(2:139|(0)(0))|146|(0)|149|(2:151|153)|154|155)|46))|22|(1:24)|25|27|(0)(0)|31|161|32|(11:34|39|40|41|165|42|43|163|44|(0)|46)(0)|72|(0)|75|(0)|(0)|146|(0)|149|(0)|154|155|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r1 != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x018c, code lost:
        
            r14 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x019a, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x019b, code lost:
        
            r14 = false;
         */
        /* JADX WARN: Removed duplicated region for block: B:106:0x02e7  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x03e8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0401  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0440  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x045c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01c5  */
        /* JADX WARN: Type inference failed for: r14v14, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v20 */
        /* JADX WARN: Type inference failed for: r14v21 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewDefaultOnAnimationEventListener.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public boolean IAuthTabCallback(@NotNull Context context, @Nullable Uri uri, boolean z) throws Throwable {
        boolean z2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (uri == null) {
            int i4 = onTransact + 33;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!onExtraCallback().IAuthTabCallback()) {
            int i6 = IAuthTabCallbackStub + 1;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        String scheme = uri.getScheme();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTouchSlop() >> 8, 6 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.getCapsMode("", 0, 0), objArr);
        if (!Intrinsics.areEqual(scheme, ((String) objArr[0]).intern())) {
            int i8 = IAuthTabCallbackStub + 79;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            String scheme2 = uri.getScheme();
            Object[] objArr2 = new Object[1];
            a(6 - (ViewConfiguration.getLongPressTimeout() >> 16), 14 - View.combineMeasuredStates(0, 0), (char) (25052 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr2);
            if (!Intrinsics.areEqual(scheme2, ((String) objArr2[0]).intern())) {
                return false;
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = uri;
        String scheme3 = uri.getScheme();
        Object[] objArr3 = new Object[1];
        a(6 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0, 0) + 14, (char) (25053 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr3);
        boolean zAreEqual = Intrinsics.areEqual(scheme3, ((String) objArr3[0]).intern());
        String host = uri.getHost();
        String strValueOf = String.valueOf(uri.getScheme());
        String queryParameter = uri.getQueryParameter("_deploymentId");
        if (queryParameter == null) {
            int i10 = onTransact + 47;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            queryParameter = "";
        }
        String strOnWarmupCompleted = c4a.onWarmupCompleted(uri);
        String strOnExtraCallback = c3ExternalSyntheticLambda4.onExtraCallback(uri);
        if (host == null || strValueOf.length() == 0) {
            z2 = false;
        } else {
            ka kaVar = ka.onWarmupCompleted;
            kaVar.onExtraCallbackWithResult(queryParameter);
            kaVar.onExtraCallback(host);
            if (zAreEqual) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                Object[] objArr4 = new Object[1];
                a(Drawable.resolveOpacity(0, 0), 6 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr4);
                objectRef.element = builderBuildUpon.scheme(((String) objArr4[0]).intern()).build();
            }
            Object obj = objectRef.element;
            Intrinsics.checkNotNullExpressionValue(obj, "");
            objectRef.element = c3ExternalSyntheticLambda4.onWarmupCompleted(c4a.onExtraCallbackWithResult((Uri) obj));
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult()), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(zAreEqual, this, host, queryParameter, context, booleanRef, objectRef, strValueOf, uri, z, strOnWarmupCompleted, strOnExtraCallback, null), 3, (Object) null);
            z2 = booleanRef.element;
        }
        int i11 = IAuthTabCallbackStub + 53;
        onTransact = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 77 / 0;
        }
        return z2;
    }
}
