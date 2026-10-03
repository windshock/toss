package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonObject;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.AUTextView;
import o.AttCertValidityPeriod;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.PlayerErrorCode;
import o.adInfo;
import o.getMinScale;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.videoFrameChanged;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTelephonyInfoHandler implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static char onExtraCallback = 11234;
    private static char onExtraCallbackWithResult = 4261;
    private static char onNavigationEvent = 35107;
    private static char onTransact = 63280;
    private final wie2 IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return GetTelephonyInfoHandler.onExtraCallback((adInfo) obj);
        }
    }, 1, (Object) null);
    private final getMinScale onWarmupCompleted = new getMinScale();

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5 | i2;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~(i2 | i8)) | (~(i9 | i5));
        int i12 = i5 + i3 + i6 + (1389894630 * i4) + ((-1243605516) * i);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i5) + 1335230464 + (862422157 * i3) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i6) + (1607991296 * i4) + ((-548405248) * i) + ((-1553596416) * i13);
        int i15 = ((i5 * (-88671125)) - 261777699) + (i3 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i6 * (-88671137)) + (i4 * (-349388198)) + (i * (-147040884)) + (i13 * 182059008);
        return i14 + ((i15 * i15) * (-132513792)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(adinfo);
        int i4 = IAuthTabCallbackDefault + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 6 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = IAuthTabCallbackDefault + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackDefault + 25;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = asInterface + 119;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
        int i6 = IAuthTabCallbackDefault + 103;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(false);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(true);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback4, iOnExtraCallback3);
        }
        adinfo.onExtraCallbackWithResult(true);
        return Unit.INSTANCE;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i2 = asInterface + 35;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{57631, 5033, 53539, 39055, 59573, 53916, 44358, 15567, 57071, 206, 12203, 48719, 45751, 13159, 58538, 39799}, (ViewConfiguration.getTapTimeout() >> 16) + 15, objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            int iIAuthTabCallback = IAuthTabCallback(context);
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            boolean zBooleanValue = ((Boolean) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, context}, iOnExtraCallbackWithResult, 412262138, iOnExtraCallbackWithResult3, -412262138, iOnExtraCallbackWithResult2)).booleanValue();
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
            boolean zOnExtraCallback = onExtraCallback(context);
            Integer numOnWarmupCompleted = onWarmupCompleted();
            Boolean boolAsBinder = asBinder();
            Boolean boolIAuthTabCallback = IAuthTabCallback();
            int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            TelephonyInfo telephonyInfo = new TelephonyInfo(iIAuthTabCallback, zBooleanValue, zOnExtraCallbackWithResult, zOnExtraCallback, numOnWarmupCompleted, boolAsBinder, boolIAuthTabCallback, (Boolean) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult4, 71049104, iOnExtraCallbackWithResult6, -71049103, iOnExtraCallbackWithResult5), asInterface());
            wie2 wie2Var = this.IAuthTabCallback;
            wie2Var.onExtraCallback();
            obj = Result.constructor-impl(wie2Var.IAuthTabCallback(TelephonyInfo.Companion.serializer(), telephonyInfo));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onNavigationEvent(obj)) {
            int i4 = IAuthTabCallbackDefault + 27;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(291820722, iIAuthTabCallback2, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback4, new Object[]{setonoutofmemeryerrorcallback, (JsonElement) obj}, iIAuthTabCallback3, -291820715);
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new char[]{11218, 27803, 21257, 23850, 37846, 45115, 10482, 39362, 58863, 28224, 2959, 53291, 44358, 15567, 58833, 25816, 37052, 62114, 49601, 64140, 5932, 32493, 56235, 53364, 21693, 19576, 14060, 12288, 47479, 6003, 17821, 58887}, ExpandableListView.getPackedPositionType(0L) + 31, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(th2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, sb.toString(), (String) null, (Map) null, 6, (Object) null);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            a(new char[]{11218, 27803, 21257, 23850, 37846, 45115, 10482, 39362, 58863, 28224, 2959, 53291, 44358, 15567, 58833, 25816, 37052, 62114, 49601, 64140, 5932, 32493, 56235, 53364, 21693, 19576, 14060, 12288, 47479, 6003, 17821, 58887}, 31 - TextUtils.indexOf("", "", 0), objArr3);
            sb2.append(((String) objArr3[0]).intern());
            sb2.append(th2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-727664198, zzgc.onExtraCallbackWithResult(), 727664201, new Object[]{convertFloatArrayToByteArray, sb2.toString(), null, 2, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
    }

    private final int IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int iOnWarmupCompleted = new AttCertValidityPeriod(context).onWarmupCompleted();
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return iOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 46480), (Process.myPid() >> 22) + 13, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22730, -1820028492, false, "IAuthTabCallback", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                Object[] objArr2 = {context};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1244859634);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12, 22731 - Drawable.resolveOpacity(0, 0), 2071196258, false, "onWarmupCompleted", new Class[]{Context.class});
                }
                Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj2, objArr2);
                int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
                Intrinsics.areEqual(objInvoke, (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
                obj.hashCode();
                throw null;
            }
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - (ViewConfiguration.getEdgeSlop() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 13, 22731 - View.getDefaultSize(0, 0), -1820028492, false, "IAuthTabCallback", (Class[]) null);
            }
            Object obj3 = ((Field) objOnExtraCallback3).get(null);
            Object[] objArr3 = {context};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1244859634);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 46480), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 22732 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2071196258, false, "onWarmupCompleted", new Class[]{Context.class});
            }
            Object objInvoke2 = ((Method) objOnExtraCallback4).invoke(obj3, objArr3);
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            boolean zAreEqual = Intrinsics.areEqual(objInvoke2, (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
            int i3 = asInterface + 77;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return Boolean.valueOf(zAreEqual);
            }
            int i4 = 1 / 0;
            return Boolean.valueOf(zAreEqual);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if ((r10 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r10, ((java.lang.String) r5[0]).intern()) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r10, ((java.lang.String) r5[0]).intern()) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        r10 = viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler.IAuthTabCallbackDefault + 101;
        viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler.asInterface = r10 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onExtraCallbackWithResult(android.content.Context r10) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler.asInterface
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler.IAuthTabCallbackDefault = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            r4 = 36
            if (r1 == 0) goto L37
            char[] r1 = new char[r4]
            r1 = {x0068: FILL_ARRAY_DATA , data: [-10542, -12366, -29262, 4764, 4440, -22733, -12093, 29656, -7318, 28518, -29103, -30982, -8465, 206, 15591, -9791, 5932, 32493, 23783, 26787, -15800, -8869, -22060, 26853, 25091, -4398, -22154, 9806, -3559, 201, 28449, 15579, -8853, -26838, -31821, 26632} // fill-array
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 96
            int r4 = r5 << r4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r1, r4, r5)
            r1 = r5[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r10 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r1)
            if (r10 != 0) goto L66
            goto L58
        L37:
            char[] r1 = new char[r4]
            r1 = {x0090: FILL_ARRAY_DATA , data: [-10542, -12366, -29262, 4764, 4440, -22733, -12093, 29656, -7318, 28518, -29103, -30982, -8465, 206, 15591, -9791, 5932, 32493, 23783, 26787, -15800, -8869, -22060, 26853, 25091, -4398, -22154, 9806, -3559, 201, 28449, 15579, -8853, -26838, -31821, 26632} // fill-array
            long r5 = android.os.SystemClock.currentThreadTimeMillis()
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r4 = r4 - r5
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r1, r4, r5)
            r1 = r5[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r10 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r1)
            if (r10 != 0) goto L66
        L58:
            int r10 = viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler.IAuthTabCallbackDefault
            int r10 = r10 + 101
            int r1 = r10 % 128
            viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler.asInterface = r1
            int r10 = r10 % r0
            if (r10 == 0) goto L64
            return r3
        L64:
            r10 = 0
            throw r10
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.GetTelephonyInfoHandler.onExtraCallbackWithResult(android.content.Context):boolean");
    }

    private final boolean onExtraCallback(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, 22731 - View.resolveSize(0, 0), -1820028492, false, "IAuthTabCallback", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1113834165);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 46480), TextUtils.lastIndexOf("", '0', 0) + 14, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22731, 1931688997, false, "onNavigationEvent", new Class[0]);
                }
                ContextCompat.checkSelfPermission(context, (String) ((Method) objOnExtraCallback2).invoke(obj2, null));
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46479), 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 22731 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1820028492, false, "IAuthTabCallback", (Class[]) null);
        }
        Object obj3 = ((Field) objOnExtraCallback3).get(null);
        try {
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1113834165);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46481 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, 22732 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1931688997, false, "onNavigationEvent", new Class[0]);
            }
            if (ContextCompat.checkSelfPermission(context, (String) ((Method) objOnExtraCallback4).invoke(obj3, null)) != 0) {
                return false;
            }
            int i3 = IAuthTabCallbackDefault + 3;
            asInterface = i3 % 128;
            return i3 % 2 != 0;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    private final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return numOnNavigationEvent;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c2 + i7) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[i2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, packedPositionGroup, minimumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 10 - View.resolveSize(0, 0), Process.getGidForName("") + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
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
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 16015), 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $11 + 115;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            cArr3 = cArr5;
            i2 = 2;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i13 = $10 + 21;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private final Boolean asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = this.onWarmupCompleted.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return boolOnExtraCallback;
    }

    private final Boolean IAuthTabCallback() {
        Boolean boolOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            boolOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = 97 / 0;
        } else {
            boolOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
        }
        int i4 = asInterface + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return boolOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GetTelephonyInfoHandler getTelephonyInfoHandler = (GetTelephonyInfoHandler) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getMinScale getminscale = getTelephonyInfoHandler.onWarmupCompleted;
        if (i3 == 0) {
            getminscale.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolOnWarmupCompleted = getminscale.onWarmupCompleted();
        int i4 = IAuthTabCallbackDefault + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return boolOnWarmupCompleted;
    }

    private final Boolean asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return boolIAuthTabCallback;
    }

    private final boolean onNavigationEvent(Context context) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this, context}, iOnExtraCallbackWithResult, 412262138, iOnExtraCallbackWithResult3, -412262138, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private final Boolean IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Boolean) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, 71049104, iOnExtraCallbackWithResult3, -71049103, iOnExtraCallbackWithResult2);
    }
}
