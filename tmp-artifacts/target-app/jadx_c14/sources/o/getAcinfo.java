package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.DownloadSchemeActivity;

@ConditionalDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAcinfo extends DeeplinkConditionalRouter {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onNavigationEvent = 8;

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {25880038, 847145428, -1556197448, 1139468076, 36708601, 277324855, 969751281, 222675927, 373449679, 1545561236, 280043478, 2096920635, -28547030, -371073417, -1708809951, 774278304, -459442205, 409626796};
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $uri;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Uri uri, Activity activity, Context context, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$uri = uri;
            this.$activity = activity;
            this.$context = context;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$uri, this.$activity, this.$context, access13800Var);
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = IAuthTabCallback;
            int i4 = -1469660336;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $11 + 7;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 73 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 8848 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i5++;
                        i4 = -1469660336;
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
            int[] iArr5 = IAuthTabCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    int i9 = $11 + 109;
                    $10 = i9 % 128;
                    if (i9 % i2 != 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 72 - View.MeasureSpec.getSize(0), KeyEvent.getDeadChar(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 71, ExpandableListView.getPackedPositionChild(0L) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    }
                    i8++;
                    i2 = 2;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i10 = $10 + 91;
                $11 = i10 % 128;
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
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22252), (ViewConfiguration.getWindowTouchSlop() >> 8) + 39, 10301 - TextUtils.getTrimmedLength(""), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12++;
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
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 4033), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 77, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* renamed from: o.getAcinfo$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        static final class C0010onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super File>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ String $data;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0010onExtraCallback(Context context, String str, access13800<? super C0010onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
                this.$data = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new C0010onExtraCallback(this.$context, this.$data, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super File> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Context context = this.$context;
                String str = this.$data;
                try {
                    Result.Companion companion = Result.Companion;
                    File file = new File(context.getCacheDir(), "download");
                    file.mkdirs();
                    File file2 = new File(file, "download_scheme_temp_file");
                    TTHistoryActivity41 tTHistoryActivity41OnWarmupCompleted = TTCeilingLandingPageActivity5.onWarmupCompleted(file2, false);
                    try {
                        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(tTHistoryActivity41OnWarmupCompleted);
                        try {
                            tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(str, Charsets.UTF_8);
                            CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, (Throwable) null);
                            CloseableKt.closeFinally(tTHistoryActivity41OnWarmupCompleted, (Throwable) null);
                            obj2 = Result.constructor-impl(file2);
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(tTHistoryActivity41OnWarmupCompleted, th);
                            throw th2;
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                Throwable th3 = Result.exceptionOrNull-impl(obj2);
                if (th3 != null) {
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DownloadSchemeRouter", th3);
                }
                if (Result.onExtraCallback(obj2)) {
                    return null;
                }
                return obj2;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Boolean boolOnNavigationEvent = null;
            if (i2 != 0) {
                int i3 = onExtraCallback + 51;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i4 + 91;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    boolOnNavigationEvent.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Uri uri = this.$uri;
                Object[] objArr = new Object[1];
                a(new int[]{-1094995135, 970676297}, 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                String queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
                if (queryParameter == null) {
                    return Unit.INSTANCE;
                }
                getHostnameVerifierokhttp gethostnameverifierokhttp = this.$activity;
                getHostnameVerifierokhttp gethostnameverifierokhttp2 = gethostnameverifierokhttp instanceof getHostnameVerifierokhttp ? gethostnameverifierokhttp : null;
                if (gethostnameverifierokhttp2 != null) {
                    getHostnameVerifierokhttp.onNavigationEvent(gethostnameverifierokhttp2, (String) null, 1, (Object) null);
                }
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                C0010onExtraCallback c0010onExtraCallback = new C0010onExtraCallback(this.$context, queryParameter, null);
                this.L$0 = access15400.onNavigationEvent(queryParameter);
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, c0010onExtraCallback, this);
                if (obj == objOnWarmupCompleted) {
                    int i6 = onExtraCallback + 55;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            }
            File file = (File) obj;
            if (file == null) {
                int i8 = onExtraCallback + 59;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return Unit.INSTANCE;
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp3 = this.$activity;
            getHostnameVerifierokhttp gethostnameverifierokhttp4 = gethostnameverifierokhttp3 instanceof getHostnameVerifierokhttp ? gethostnameverifierokhttp3 : null;
            if (gethostnameverifierokhttp4 != null) {
                gethostnameverifierokhttp4.dismissLoadingIndicator();
            }
            DownloadSchemeActivity.onWarmupCompleted onwarmupcompleted = DownloadSchemeActivity.Companion;
            Context context = this.$context;
            String queryParameter2 = this.$uri.getQueryParameter("successMessage");
            String queryParameter3 = this.$uri.getQueryParameter("showSnackBar");
            if (queryParameter3 != null) {
                int i10 = onNavigationEvent + 53;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    access14000.onNavigationEvent(Boolean.parseBoolean(queryParameter3));
                    throw null;
                }
                boolOnNavigationEvent = access14000.onNavigationEvent(Boolean.parseBoolean(queryParameter3));
            }
            this.$context.startActivity(onwarmupcompleted.onWarmupCompleted(context, file, queryParameter2, boolOnNavigationEvent));
            return Unit.INSTANCE;
        }
    }

    public void execute(@NotNull Context context, @NotNull Uri uri) {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback != null) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback instanceof TextFieldScrollKtExternalSyntheticLambda0 ? textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback : null;
            if (textFieldScrollKtExternalSyntheticLambda0 == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0)) == null) {
                return;
            }
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(uri, textFieldScrollKtExternalSyntheticLambda0IAuthTabCallback, context, null), 3, (Object) null);
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
