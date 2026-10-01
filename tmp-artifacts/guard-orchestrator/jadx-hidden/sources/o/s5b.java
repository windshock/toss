package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.gson.JsonObject;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import im.toss.security.impl.malware.messagehandler.FetchMalwareAppListHandler$;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.bindContext;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class s5b implements ALCFaceQuality {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(s5b.class);
    private final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new FetchMalwareAppListHandler$.ExternalSyntheticLambda1());

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if ((1 & (((i4 & i3) | (i3 ^ i4)) >> 15)) == 0) {
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        onExtraCallbackWithResult(str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i4 | i6)) | i;
        int i8 = ~i4;
        int i9 = ~((~i) | i8 | i6);
        int i10 = (~(i6 | i)) | (~(i8 | (~i6)));
        int i11 = i4 + i + i2 + (1616745821 * i5) + (2077170981 * i3);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i4) + 1587019776 + (806482222 * i) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i2) + ((-395313152) * i5) + (904921088 * i3) + (345505792 * i12);
        int i14 = (i4 * (-1558553916)) + 318941677 + (i * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i2 * (-1558553459)) + (i5 * 397062201) + (i3 * 609114465) + (i12 * (-138936320));
        int i15 = i13 + (i14 * i14 * 1630011392);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? i15 != 5 ? onExtraCallbackWithResult(objArr) : IAuthTabCallbackStub(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2336);
        s5a s5aVarAsInterface = asInterface();
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 3) & 1) == 0) {
            return s5aVarAsInterface;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        s5b s5bVar = (s5b) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2116);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 17) & 1) != 0) {
            return s5bVar.onWarmupCompleted();
        }
        s5bVar.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
        int iOnWarmupCompleted = ((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5512)) >> 21) & 1;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (iOnWarmupCompleted != 0) {
            int i4 = 30 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        if ((((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338)) >> 25) & 1) != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i2 = 79 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1043);
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 5) & 1) != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4498);
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 12) & 1) != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
        int i5 = i4 & iOnWarmupCompleted;
        int i6 = (i4 ^ iOnWarmupCompleted) | i5;
        Object obj = null;
        if ((((i6 & (~i5)) >> 13) & 1) != 0) {
            obj.hashCode();
            throw null;
        }
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i7 = onNavigationEvent;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
        if (((((i7 | iOnWarmupCompleted2) & (~(i7 & iOnWarmupCompleted2))) >> 6) & 1) == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        s5b s5bVar = (s5b) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(601);
        s5a s5aVar = (s5a) s5bVar.onExtraCallbackWithResult.getValue();
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5720);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 1) & 1) != 0) {
            int i3 = 99 / 0;
        }
        return s5aVar;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Object objOnExtraCallback;
        s5a s5aVar;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5782);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 16) & 1) != 0) {
            Response response = Response.onNavigationEvent;
            objOnExtraCallback = Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), s3e.class);
            int i3 = 79 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            objOnExtraCallback = Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), s3e.class);
        }
        int i4 = onNavigationEvent;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434);
        if ((((((~i4) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i4)) >> 10) & 1) == 0) {
            s5aVar = (s5a) ((s3e) objOnExtraCallback).ComponentActivityExternalSyntheticLambda12$42507667();
            int i5 = 84 / 0;
        } else {
            s5aVar = (s5a) ((s3e) objOnExtraCallback).ComponentActivityExternalSyntheticLambda12$42507667();
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
        return s5aVar;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new FetchMalwareAppListHandler$.ExternalSyntheticLambda0());
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 30) & 1) != 0) {
            int i4 = 44 / 0;
        }
        return iAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
        boolean zIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 8) & 1) == 0) {
            return Boolean.valueOf(zIAuthTabCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int[] onNavigationEvent = {-192935695, 1006539108, 685711236, 150688246, 1900219588, -166581588, -1995399933, 2070391264, 445915841, -267995431, -1915724690, -653383073, -1460789493, -990849936, 1297055549, 1354150857, 1526025893, 1783502925};
        private static int onWarmupCompleted;
        final /* synthetic */ setOnOutOfMemeryErrorCallback onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
            super(onwarmupcompleted);
            this.onExtraCallbackWithResult = setonoutofmemeryerrorcallback;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.onExtraCallbackWithResult;
            String message = th.getMessage();
            if (message == null) {
                Object[] objArr = new Object[1];
                a(new int[]{23966787, -726996310, -1925909436, 1258854179}, View.MeasureSpec.getSize(0) + 5, objArr);
                message = ((String) objArr[0]).intern();
                int i4 = onWarmupCompleted + 99;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, message, (String) null, (Map) null, 6, (Object) null);
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onNavigationEvent;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i4 = $11 + 15;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 4;
                }
                for (int i6 = 0; i6 < length2; i6++) {
                    iArr4[i6] = Hilt_QuickActionBottomSheetActivity$4.h(iArr3[i6]);
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = onNavigationEvent;
            if (iArr6 != null) {
                int i7 = $11 + 5;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    iArr2[i2] = Hilt_QuickActionBottomSheetActivity$4.h(iArr6[i2]);
                    i2++;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i8 = $10 + 113;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                for (int i10 = 0; i10 < 16; i10++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i10];
                    int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                }
                int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i11;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5512);
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792);
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3328);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 13) & 1) == 0) {
            throw null;
        }
        if (context == null) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434);
            return;
        }
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(CoroutineExceptionHandler.extraCallbackWithResult, setonoutofmemeryerrorcallback);
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(context, setonoutofmemeryerrorcallback, null);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4550);
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, iAuthTabCallback, (setRandomHost) null, onwarmupcompleted, 2, (Object) null);
        int i4 = onNavigationEvent;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
        int i5 = (~iOnWarmupCompleted2) & i4;
        int i6 = (~i4) & iOnWarmupCompleted2;
        if (((((i6 & i5) | (i5 ^ i6)) >> 30) & 1) != 0) {
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ Context $context;
        int label;
        private static char[] onExtraCallback = {32521, 32523, 32512, 32724, 32568, 32517, 32717, 32570, 32527, 32569, 32575, 32519, 32522, 32526, 32515, 32518, 32574, 32513, 32573, 32524};
        private static int onNavigationEvent = -1184333900;
        private static boolean IAuthTabCallback = true;
        private static boolean onExtraCallbackWithResult = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = s5b.this.new onWarmupCompleted(this.$context, this.$callbackProxy, access13800Var);
            int i2 = IAuthTabCallbackStub + 71;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackStub + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 41;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                s5a s5aVarOnExtraCallbackWithResult = s5b.onExtraCallbackWithResult(s5b.this);
                Context context = this.$context;
                this.label = 1;
                obj = s5aVarOnExtraCallbackWithResult.onNavigationEvent(context, false, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 127 - Color.green(0), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = IAuthTabCallbackStub + 121;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            ALCFaceBox.onExtraCallback(this.$callbackProxy, ALCEyeBlink.onExtraCallback().toJson((List) obj));
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallbackStub + 33;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    cArr3[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i3]);
                    i3++;
                    int i4 = $10 + 61;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 / 2;
                    }
                }
                cArr2 = cArr3;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onNavigationEvent);
            if (onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 61;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] >>> iY);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    }
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                String str = new String(cArr4);
                int i7 = $11 + 29;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                objArr[0] = str;
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i9 = $11 + 41;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr6);
        }
    }

    public static /* synthetic */ s5a IAuthTabCallback() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (s5a) onExtraCallbackWithResult(1903226362, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1903226358, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(1933045331, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{str, str2}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1933045329, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback)).booleanValue();
    }

    public static final /* synthetic */ s5a onExtraCallbackWithResult(s5b s5bVar) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (s5a) onExtraCallbackWithResult(-101985210, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{s5bVar}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 101985211, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback);
    }

    private final s5a onWarmupCompleted() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (s5a) onExtraCallbackWithResult(950381044, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -950381041, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback);
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(-517293365, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{str, str2}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 517293370, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback)).booleanValue();
    }

    private static final s5a asInterface() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (s5a) onExtraCallbackWithResult(-98072115, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 98072115, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback);
    }
}
