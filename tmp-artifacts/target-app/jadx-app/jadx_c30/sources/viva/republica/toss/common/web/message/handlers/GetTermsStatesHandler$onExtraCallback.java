package viva.republica.toss.common.web.message.handlers;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.GeckoHubImp1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.jni_YGNodeStyleGetDirectionJNI;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jmrtd.lds.iso19794.IrisImageInfo;
import viva.republica.toss.common.web.message.handlers.GetTermsStatesHandler;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class GetTermsStatesHandler$onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends GetTermsStatesHandler.TermsState>>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = {-377315063, -1999001728, -766402574, 615774422, 1937298109, 1632973475, 1583174477, -1818012353, -1724854362, 931479608, 736861525, -2046838656, 55868514, -1482659731, 687762388, -1458700091, 1943911025, 748857650};
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    final /* synthetic */ List<Long> $termsIds;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ GetTermsStatesHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetTermsStatesHandler$onExtraCallback(GetTermsStatesHandler getTermsStatesHandler, List<Long> list, access13800<? super GetTermsStatesHandler$onExtraCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = getTermsStatesHandler;
        this.$termsIds = list;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GetTermsStatesHandler$onExtraCallback getTermsStatesHandler$onExtraCallback = new GetTermsStatesHandler$onExtraCallback(this.this$0, this.$termsIds, access13800Var);
        getTermsStatesHandler$onExtraCallback.L$0 = obj;
        int i2 = onNavigationEvent + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return getTermsStatesHandler$onExtraCallback;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super List<GetTermsStatesHandler.TermsState>> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        int i3 = onExtraCallback + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnNavigationEvent;
        }
        obj3.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<GetTermsStatesHandler.TermsState>> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Unit>>, Object> {
        int label;
        final /* synthetic */ GetTermsStatesHandler this$0;
        private static final byte[] $$a = {23, ISO7816.INS_PUT_DATA, -83, 70};
        private static final int $$b = 50;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onNavigationEvent = 1;
        private static long onExtraCallback = 7798559133331975163L;
        private static int onExtraCallbackWithResult = -1776194565;
        private static char IAuthTabCallback = 22863;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, byte b2) {
            int i;
            byte[] bArr = $$a;
            int i2 = b2 * 2;
            int i3 = 4 - (b * 4);
            int i4 = s + 109;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            if (bArr == null) {
                int i6 = i5;
                int i7 = 0;
                i4 = (-i4) + i6;
                i3++;
                i = i7;
                bArr2[i] = (byte) i4;
                i7 = i + 1;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                i6 = i4;
                i4 = bArr[i3];
                i4 = (-i4) + i6;
                i3++;
                i = i7;
                bArr2[i] = (byte) i4;
                i7 = i + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                i7 = i + 1;
                if (i == i5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(GetTermsStatesHandler getTermsStatesHandler, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.this$0 = getTermsStatesHandler;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, access13800Var);
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Result<Unit>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                GetTermsStatesHandler getTermsStatesHandler = this.this$0;
                this.label = 1;
                objOnWarmupCompleted = GetTermsStatesHandler.onWarmupCompleted(getTermsStatesHandler, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) - 528984839, new char[]{43087, 287, 35151, 25929, 31661, 46487, 39323, 34695, 45785, 13643, 62096, 46544, 22112, 41356, 22121, 22613, 29937, 35395, 38625, 10081, 13952, 20859, 39124, 51402, 29477, 37070, 64183, 37601, 38121, 60748, 59607, 29654, 42574, 6245, 25191, 38485, 54184, 40157, 61580, 41704, 11309, 26891, 51147, 54353, 46574, 40714, 10865}, new char[]{0, 0, 0, 0}, new char[]{63851, 30804, 39392, 61596}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = onWarmupCompleted + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = ((Result) obj).onNavigationEvent();
            }
            return Result.IAuthTabCallback(objOnWarmupCompleted);
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
                int i4 = $10 + 91;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), '[' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 49124), Color.rgb(0, 0, 0) + 16777260, 1494 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (KeyEvent.getMaxKeyCode() >> 16) + 50, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 45848), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, KeyEvent.normalizeMetaState(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                int i6 = $11 + 5;
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
            String str = new String(cArr6);
            int i8 = $11 + 23;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends GetTermsStatesHandler.TermsState>>, Object> {
        final /* synthetic */ List<Long> $termsIds;
        int label;
        final /* synthetic */ GetTermsStatesHandler this$0;
        private static final byte[] $$a = {ISO7816.INS_VERIFY, 13, ISO7816.INS_GET_DATA, -47};
        private static final int $$b = IrisImageInfo.IMAGE_QUAL_UNDEF;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onExtraCallback = {8387, 17570, 59402, 3557, 45324, 54587, 31389, 40501, 927, 42921, 51995, 28818, 38001, 14794, 23983, 49482, 26288, 35409, 11827, 21407, 63347, 7373, 32839, 9317, 18895, 60770, 4800, 46759, 55835, 32764, 58207, 1914, 44256, 53268, 30191, 39261, 15652, 41679, 50801, 27610, 36778, 13076, 22763, 64629, 25037, 34217, 10511};
        private static long IAuthTabCallback = -6035077310687573577L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, short s2) {
            int i2;
            byte[] bArr = $$a;
            int i3 = s2 * 3;
            int i4 = i + 4;
            int i5 = 97 - (s * 3);
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i6 = i5;
                i5 = i3;
                i2 = 0;
                i5 += i6;
                bArr2[i2] = (byte) i5;
                if (i2 == i3) {
                    return new String(bArr2, 0);
                }
                i2++;
                i4++;
                i6 = bArr[i4];
                i5 += i6;
                bArr2[i2] = (byte) i5;
                if (i2 == i3) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                if (i2 == i3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(GetTermsStatesHandler getTermsStatesHandler, List<Long> list, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = getTermsStatesHandler;
            this.$termsIds = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$termsIds, access13800Var);
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 68 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<GetTermsStatesHandler.TermsState>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<GetTermsStatesHandler.TermsState>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                GetTermsStatesHandler getTermsStatesHandler = this.this$0;
                List<Long> list = this.$termsIds;
                this.label = 1;
                Object objOnWarmupCompleted2 = GetTermsStatesHandler.onWarmupCompleted(getTermsStatesHandler, list, this);
                if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                    return objOnWarmupCompleted2;
                }
                int i4 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 71;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0 ? i3 != 1 : i3 != 0) {
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getPressedStateDuration() >> 16, Color.rgb(0, 0, 0) + 16777263, (char) (52596 - Color.alpha(0)), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i8 = i6 + 91;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i9 == 0) {
                return obj;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01ab  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            double d;
            Throwable cause;
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (true) {
                d = 0.0d;
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                    break;
                }
                int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 59696), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myPid() >> 22) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.green(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, 20220 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49123), 43 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.myPid() >> 22) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            int i5 = $11 + 59;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)), 1494 - View.resolveSize(0, 0), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                d = 0.0d;
            }
            String str = new String(cArr);
            int i7 = $10 + 51;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<Result<? extends Unit>, access13800<? super List<? extends GetTermsStatesHandler.TermsState>>, Object> {
        final /* synthetic */ GeckoHubImp1<List<GetTermsStatesHandler.TermsState>> $termsStateResultFromTermsManagerJob;
        int I$0;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        private static final byte[] $$a = {69, -50, 81, 75};
        private static final int $$b = 119;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static int onExtraCallbackWithResult = 478309023;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, int i) {
            int i2;
            int i3;
            int i4 = 4 - (b2 * 3);
            int i5 = 105 - (i * 3);
            int i6 = 1 - (b * 2);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i5;
                i3 = 0;
                i5 = i6;
                i5 += i7;
                i4++;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i4];
                i5 += i7;
                i4++;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(GeckoHubImp1<? extends List<GetTermsStatesHandler.TermsState>> geckoHubImp1, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$termsStateResultFromTermsManagerJob = geckoHubImp1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$termsStateResultFromTermsManagerJob, access13800Var);
            onextracallback.L$0 = ((Result) obj).onNavigationEvent();
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(((Result) obj).onNavigationEvent(), (access13800) obj2);
            int i4 = onWarmupCompleted + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(Object obj, access13800<? super List<GetTermsStatesHandler.TermsState>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(Result.IAuthTabCallback(obj), access13800Var);
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object obj2 = this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1<List<GetTermsStatesHandler.TermsState>> geckoHubImp1 = this.$termsStateResultFromTermsManagerJob;
                if (Result.exceptionOrNull-impl(obj2) != null) {
                    return null;
                }
                this.L$0 = access15400.onNavigationEvent(obj2);
                this.L$1 = access15400.onNavigationEvent((Unit) obj2);
                this.I$0 = 0;
                this.label = 1;
                obj = geckoHubImp1.IAuthTabCallback(this);
                if (obj == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 37;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 45 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(47 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), Gravity.getAbsoluteGravity(0, 0) + 16, new char[]{65483, '\t', 17, 25, 23, '\t', 22, 65483, 65476, 19, 24, 65476, 16, 16, 5, 7, '\t', 18, '\r', 24, 25, 19, 22, 19, 7, 65476, '\f', 24, '\r', 27, 65476, 65483, '\t', 15, 19, 26, 18, '\r', 65483, 65476, '\t', 22, 19, '\n', '\t', 6, 65476}, true, KeyEvent.normalizeMetaState(0) + 274, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
            }
            List list = (List) obj;
            int i5 = onWarmupCompleted + 77;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $11 + 55;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 23, (ViewConfiguration.getTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12843), 55 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2167 - (ViewConfiguration.getEdgeSlop() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            if (i2 > 0) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                int i11 = $11 + 9;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 12843), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 54, (ViewConfiguration.getScrollBarSize() >> 8) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<List<? extends GetTermsStatesHandler.TermsState>, access13800<? super List<? extends GetTermsStatesHandler.TermsState>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        /* synthetic */ Object L$0;
        int label;
        private static char[] onWarmupCompleted = {64989, 64976, 64988, 64961, 64915, 65064, 65065, 64986, 64980, 64977, 64983, 64991, 64981, 64966, 64979, 64978, 64965, 64984, 64967, 64960, 64982, 64990, 64916, 64987, 64964};
        private static char onExtraCallback = 51244;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((List) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(List<GetTermsStatesHandler.TermsState> list, access13800<? super List<GetTermsStatesHandler.TermsState>> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(list, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            List list = (List) this.L$0;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{0, 16, 13844, 13844, 3, 19, 3, 0, 23, 2, 24, 15, 11, 23, 21, 23, '\t', 14, 22, '\n', 3, 4, 24, 0, 2, '\f', 1, 15, 7, 22, 21, 23, '\t', 4, '\b', 17, 24, 3, 2, 3, 4, 3, 18, 23, 5, 2, 13853}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 30), 47 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i4 = i3 + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            int i6 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return list;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            char c;
            int length;
            char[] cArr2;
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onWarmupCompleted;
            int i5 = 7;
            if (cArr3 != null) {
                int i6 = $11 + 45;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    int i7 = $11 + i5;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), Color.red(0) + 26, 23139 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        i5 = 7;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            char c2 = '0';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1), View.getDefaultSize(0, 0) + 26, 23139 - Drawable.resolveOpacity(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i9 = $11 + 1;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i10 = $10 + 117;
                            $11 = i10 % 128;
                            if (i10 % 2 == 0) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback * b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback / b);
                            } else {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            }
                            c = c2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24872 - AndroidCharacter.getMirror(c2)), View.getDefaultSize(0, 0) + 74, 8088 - Color.argb(0, 0, 0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    c = '0';
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1), 30 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 19489 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c = '0';
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                            } else {
                                c = '0';
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                                } else {
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    c2 = c;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                int i17 = $10 + 47;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onExtraCallback + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 1) {
                Object[] objArr = new Object[1];
                a(new int[]{1607830157, -679608740, -921358098, 4730946, 606748954, -1834469420, 965189948, 293071229, -1653359193, -785624220, -184058838, -830130545, -643378642, -1710109304, 725587067, -1447613034, 1553712083, -2032853764, -1799731850, -562456414, 654404951, 873958771, 1930241265, 1645361957}, 47 - (Process.myTid() >> 22), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        Object obj2 = null;
        GeckoHubImp1 geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this.this$0, null), 3, (Object) null);
        GeckoHubImp1 geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this.this$0, this.$termsIds, null), 3, (Object) null);
        jni_YGNodeStyleGetDirectionJNI jni_ygnodestylegetdirectionjni = new jni_YGNodeStyleGetDirectionJNI(getContext());
        jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult(geckoHubImp1OnExtraCallback.onTransact(), new onExtraCallback(geckoHubImp1OnExtraCallback2, null));
        jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult(geckoHubImp1OnExtraCallback2.onTransact(), new onWarmupCompleted(null));
        this.L$0 = access15400.onNavigationEvent(findresandmsg);
        this.L$1 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback);
        this.L$2 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback2);
        this.L$3 = access15400.onNavigationEvent(jni_ygnodestylegetdirectionjni);
        this.I$0 = 0;
        this.I$1 = 0;
        this.label = 1;
        Object objOnExtraCallback = jni_ygnodestylegetdirectionjni.onExtraCallback(this);
        if (objOnExtraCallback != objOnWarmupCompleted) {
            return objOnExtraCallback;
        }
        int i5 = onExtraCallback + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        float f = 0.0f;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 63;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 72 - (KeyEvent.getMaxKeyCode() >> 16), 8848 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 47;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 % 4;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int i11 = $10 + 55;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 93;
                $11 = i14 % 128;
                if (i14 % i3 == 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i13]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), View.MeasureSpec.makeMeasureSpec(i5, i5) + 72, 8848 - View.combineMeasuredStates(i5, i5), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), ExpandableListView.getPackedPositionChild(0L) + 73, 8847 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i13++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                i3 = 2;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i15 = $11 + 7;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 40, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i17++;
            }
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 4034), View.MeasureSpec.getMode(0) + 78, 7398 - ExpandableListView.getPackedPositionType(0L), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
