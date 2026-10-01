package o;

import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda23 {
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static boolean asBinder = false;
    private static boolean asInterface = false;
    private static int getInterfaceDescriptor = 1;
    private static char onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char[] onTransact;
    private static char onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Class<o.ExoPlayerImplExternalSyntheticLambda26>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Class<android.os.Parcelable>] */
    public static ExoPlayerImplExternalSyntheticLambda27 onNavigationEvent() throws Throwable {
        ExoPlayerImplExternalSyntheticLambda27 exoPlayerImplExternalSyntheticLambda27;
        try {
            Object[] objArr = new Object[1];
            onExtraCallbackWithResult("\u0010\u0010\u0002\u0000\f\u000f￭ￋ\u0010\fￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe", 102 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, Color.argb(0, 0, 0, 0) + 18, 17 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            onExtraCallbackWithResult("￼\u0001￭\u0011\u0005", TextUtils.indexOf("", "", 0, 0) + 108, true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, 6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() % 100000;
            if (iIntValue >= 99000 && iIntValue <= 99999) {
                return null;
            }
            if (iIntValue >= 90000 && iIntValue <= 98999) {
                return null;
            }
            Object[] objArr3 = new Object[1];
            onNavigationEvent("⤈覔눐⥛톙捆朌ᇊ莽ᱤ㈿뫋糄즚饄쐰⧝抭摵ᅕ舕ῖ㊠멸缷", View.combineMeasuredStates(0, 0) + 1, objArr3);
            Object[] objArr4 = {(String) objArr3[0], 10};
            Object[] objArr5 = new Object[1];
            onExtraCallbackWithResult("\n\u0003\u0010\ufff2\u0006\u0010\u0003\uffff\u0002\uffff\f\u0002\u0010\r\u0007\u0002ￌ\r\u0011ￌ￦\uffff\f\u0002", Drawable.resolveOpacity(0, 0) + 102, false, (ViewConfiguration.getTapTimeout() >> 16) + 9, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, objArr5);
            HandlerThread handlerThread = (HandlerThread) Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class, Integer.TYPE).newInstance(objArr4);
            handlerThread.start();
            Object[] objArr6 = new Object[1];
            onExtraCallbackWithResult("\n\u0003\u0010\ufff2\u0006\u0010\u0003\uffff\u0002\uffff\f\u0002\u0010\r\u0007\u0002ￌ\r\u0011ￌ￦\uffff\f\u0002", 102 - TextUtils.indexOf("", "", 0), false, TextUtils.indexOf((CharSequence) "", '0', 0) + 10, TextUtils.lastIndexOf("", '0', 0) + 25, objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            onExtraCallbackWithResult(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0087\u0082\u0086\u0085\u0085\u0084\u0083\u0082\u0081", objArr7);
            Object[] objArr8 = {cls2.getMethod((String) objArr7[0], null).invoke(handlerThread, null)};
            Object[] objArr9 = new Object[1];
            onExtraCallbackWithResult(TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, null, "\u0087\u0082\u008f\u008a\u0089\u0088\u008e\u008c\u008d\u0085\u008c\u008a\u008b\u0085\u0087\u008a\u0089\u0088", objArr9);
            RunnableFutureTask runnableFutureTask = new RunnableFutureTask((Handler) Class.forName((String) objArr9[0]).getDeclaredConstructor(Looper.class).newInstance(objArr8), handlerThread);
            ExoPlayerImplExternalSyntheticLambda27 exoPlayerImplExternalSyntheticLambda272 = new ExoPlayerImplExternalSyntheticLambda27(runnableFutureTask);
            try {
                Object[] objArr10 = new Object[1];
                onNavigationEvent("醘䎸꺪釹䨊ꥡ箠詝㬫홂⺄℥쑁Χ藼忹配ꢐ磜諚㪞헶⸀⇦잀˓蕢尞郑ꠃ", 1 - TextUtils.indexOf("", "", 0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                onNavigationEvent("響꒚衛見鈋乘嵇剜僐ㅧࡥ屢꾡\ue485ꌑ螿爵侰席勛其㋓", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr11);
                Object objInvoke = cls3.getMethod((String) objArr11[0], new Class[0]).invoke(null, null);
                if (objInvoke != null) {
                    exoPlayerImplExternalSyntheticLambda27 = ExoPlayerImplExternalSyntheticLambda26.class;
                    try {
                        try {
                            Object[] objArr12 = {objInvoke, exoPlayerImplExternalSyntheticLambda27};
                            Object[] objArr13 = new Object[1];
                            onExtraCallbackWithResult("\n￥ￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000\u0005\u000b\u000e\u0000\n�\u0010\n\u0001\u0010", ((byte) KeyEvent.getModifierMetaStateMask()) + 105, true, 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            Class<?>[] clsArr = new Class[2];
                            try {
                                Object[] objArr14 = new Object[1];
                                onExtraCallbackWithResult("\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 105, true, Color.alpha(0) + 23, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, objArr14);
                                clsArr[0] = Class.forName((String) objArr14[0]);
                                clsArr[1] = Class.class;
                                Intent intent = (Intent) cls4.getDeclaredConstructor(clsArr).newInstance(objArr12);
                                try {
                                    Object[] objArr15 = new Object[1];
                                    onNavigationEvent("㛧獇產㚍觽馑ꀺ䦹鰕\ue6b8\uf509\ue292挸㌆幗鱔㘁顥ꍎ䤣", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr15);
                                    Object[] objArr16 = new Object[1];
                                    IAuthTabCallback("⩒᮲", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, objArr16);
                                    Object[] objArr17 = new Object[1];
                                    IAuthTabCallback("ᑴꦿ䕁꿔띃㘧嫟䜨┚튰䝬嘤៴㦴꽠ᝦ陿ꧮ\uffc8큑䝬嘤", 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr17);
                                    Object[] objArr18 = new Object[1];
                                    onNavigationEvent("䁆\uf2da灯䀡뿑᠈ꕵ群\ueafb朻\uf046풵ᖒ닔嬫ꩠ䂷᧔ꘕ缜\ueb44撜", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr18);
                                    Object[] objArr19 = new Object[1];
                                    onNavigationEvent("쟢뫡⟰자\u008b倳\uf2fd샋浗⼄\ua7df毸", -ExpandableListView.getPackedPositionChild(0L), objArr19);
                                    Object[] objArr20 = new Object[1];
                                    IAuthTabCallback("ᑴꦿ䕁꿔띃㘧嫟䜨녈ﴱ撢\udc13\u2455ꢦ⪆莔һӔ", 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr20);
                                    Object[] objArr21 = new Object[1];
                                    IAuthTabCallback("\udc98헺⡗⽞ㄕ캊줼ɖ椀\uedd7", TextUtils.lastIndexOf("", '0') + 10, objArr21);
                                    Object[] objArr22 = new Object[1];
                                    onNavigationEvent("㚥嗙\uf7b3㛏詅뼏⊫䨁鱗쀣瞖\ue16a损ᗏ\udce1鿽㙰뻠⇃䪝鶬쎱眘\ue1a4悙ᒯ\udc7d鱧㟹빴⅀䭩髌", 1 - ExpandableListView.getPackedPositionType(0L), objArr22);
                                    Object[] objArr23 = new Object[1];
                                    IAuthTabCallback("♛\udcc0ᨱ\uf7eeһӔ", (ViewConfiguration.getLongPressTimeout() >> 16) + 5, objArr23);
                                    Object[] objArr24 = new Object[1];
                                    IAuthTabCallback("̽\uec4a\ue7caഢꑭ뇺쪵洄", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, objArr24);
                                    Object[] objArr25 = new Object[1];
                                    IAuthTabCallback("ᑴꦿ䕁꿔띃㘧嫟䜨豆㭂玺\u05ff촁ᵥ䈛丛\ue023᧗", 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr25);
                                    Object[] objArr26 = new Object[1];
                                    IAuthTabCallback("㺁墔៴㦴", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, objArr26);
                                    Object[] objArr27 = new Object[1];
                                    IAuthTabCallback("\udbf8敐槆➶⣡㒉㱗頩\u086b콞뒌㼑뎤䊈䝬嘤\ue023᧗", 16 - TextUtils.lastIndexOf("", '0', 0), objArr27);
                                    Object[] objArr28 = new Object[1];
                                    IAuthTabCallback("葄㉟㡌ᡞ", (Process.myTid() >> 22) + 4, objArr28);
                                    Object[] objArr29 = new Object[1];
                                    onNavigationEvent("ꟗ봥\uf5b0ꞽ袀埳₨䣄ഥ⣟疕\ue3af\uf229ﴣ\udefa鴸꜇嘋⏁䡚ೕ⭫甞\ue361\uf1f4ﱔ", View.getDefaultSize(0, 0) + 1, objArr29);
                                    Object[] objArr30 = new Object[1];
                                    onNavigationEvent("\uf483鄍렻\uf4e0뾉篖洺翟帺", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr30);
                                    Object[] objArr31 = new Object[1];
                                    IAuthTabCallback("葄㉟ᓌ\ue1e3账蚏", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, objArr31);
                                    Object[] objArr32 = new Object[1];
                                    onNavigationEvent("\udd7b呥兎\udd1a틟뺼葄ኈ矈솟텠맰袬ᑹ穆읐\udd8a뽝蜹ሊ癿숐퇵뤩譒ᔏ窂쓋\udc21", -ImageFormat.getBitsPerPixel(0), objArr32);
                                    Object[] objArr33 = new Object[1];
                                    IAuthTabCallback("㱗頩㨷ࠨ", 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr33);
                                    String[] strArr = {(String) objArr15[0], (String) objArr16[0], (String) objArr17[0], (String) objArr18[0], (String) objArr19[0], (String) objArr20[0], (String) objArr21[0], (String) objArr22[0], (String) objArr23[0], (String) objArr24[0], (String) objArr25[0], (String) objArr26[0], ((String) objArr27[0]).intern(), (String) objArr28[0], (String) objArr29[0], (String) objArr30[0], (String) objArr31[0], (String) objArr32[0], (String) objArr33[0]};
                                    Object[] objArr34 = new Object[1];
                                    IAuthTabCallback("宍鉂䇽紺", 4 - Color.alpha(0), objArr34);
                                    intent.putExtra((String) objArr34[0], strArr);
                                    exoPlayerImplExternalSyntheticLambda27 = new Object[1];
                                    onNavigationEvent("쟢뫡⟰자\u008b倳\uf2fd샋浗⼄\ua7df毸", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, exoPlayerImplExternalSyntheticLambda27);
                                    try {
                                        Object[] objArr35 = {(String) exoPlayerImplExternalSyntheticLambda27[0], runnableFutureTask};
                                        Object[] objArr36 = new Object[1];
                                        onExtraCallbackWithResult("\n￥ￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000\u0005\u000b\u000e\u0000\n�\u0010\n\u0001\u0010", KeyEvent.normalizeMetaState(0) + 104, true, TextUtils.getCapsMode("", 0, 0) + 18, 22 - KeyEvent.normalizeMetaState(0), objArr36);
                                        ?? cls5 = Class.forName((String) objArr36[0]);
                                        Object[] objArr37 = new Object[1];
                                        onExtraCallbackWithResult("\u0005\n\tￚ\r\t\u0007\ufff6", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 110, false, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0') + 9, objArr37);
                                        exoPlayerImplExternalSyntheticLambda27 = Parcelable.class;
                                        cls5.getMethod((String) objArr37[0], new Class[]{String.class, exoPlayerImplExternalSyntheticLambda27}).invoke(intent, objArr35);
                                        try {
                                            Object[] objArr38 = {intent, exoPlayerImplExternalSyntheticLambda272, 1};
                                            Object[] objArr39 = new Object[1];
                                            onExtraCallbackWithResult("\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼", (ViewConfiguration.getScrollBarSize() >> 8) + 105, true, 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 23, objArr39);
                                            Class<?> cls6 = Class.forName((String) objArr39[0]);
                                            Object[] objArr40 = new Object[1];
                                            try {
                                                onExtraCallbackWithResult((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, null, "\u0082\u0093\u008b\u0092\u0087\u0082\u0091\u008a\u0089\u008b\u0090", objArr40);
                                                String str = (String) objArr40[0];
                                                Object[] objArr41 = new Object[1];
                                                onExtraCallbackWithResult("\n￥ￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000\u0005\u000b\u000e\u0000\n�\u0010\n\u0001\u0010", 104 - (ViewConfiguration.getLongPressTimeout() >> 16), true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, 22 - ((Process.getThreadPriority(0) + 20) >> 6), objArr41);
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause2 = th3.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th3;
                                    }
                                } catch (Exception unused) {
                                    exoPlayerImplExternalSyntheticLambda27 = 0;
                                    handlerThread.quit();
                                    return exoPlayerImplExternalSyntheticLambda27;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                Throwable cause3 = th.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            handlerThread.quit();
                            return exoPlayerImplExternalSyntheticLambda27;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                return exoPlayerImplExternalSyntheticLambda272;
            } catch (Exception unused3) {
                exoPlayerImplExternalSyntheticLambda27 = 0;
            }
        } catch (Throwable th6) {
            Throwable cause4 = th6.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th6;
        }
    }

    private static void onNavigationEvent(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        char[] charArray = str;
        if (str != null) {
            int i3 = IAuthTabCallbackStubProxy + 81;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            charArray = str.toCharArray();
        }
        RepeatModeUtil repeatModeUtil = new RepeatModeUtil();
        char[] cArrOnExtraCallback = RepeatModeUtil.onExtraCallback(onExtraCallbackWithResult ^ 8686948009763778008L, charArray, i);
        repeatModeUtil.IAuthTabCallback = 4;
        int i5 = access000 + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        while (repeatModeUtil.IAuthTabCallback < cArrOnExtraCallback.length) {
            repeatModeUtil.onNavigationEvent = repeatModeUtil.IAuthTabCallback - 4;
            cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback] = (char) ((cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback] ^ cArrOnExtraCallback[repeatModeUtil.IAuthTabCallback % 4]) ^ (repeatModeUtil.onNavigationEvent * (onExtraCallbackWithResult ^ 8686948009763778008L)));
            repeatModeUtil.IAuthTabCallback++;
        }
        objArr[0] = new String(cArrOnExtraCallback, 4, cArrOnExtraCallback.length - 4);
    }

    public static void onExtraCallback(ExoPlayerImplExternalSyntheticLambda27 exoPlayerImplExternalSyntheticLambda27) throws Throwable {
        int i = 2 % 2;
        exoPlayerImplExternalSyntheticLambda27.onNavigationEvent().onNavigationEvent();
        try {
            Object[] objArr = new Object[1];
            onNavigationEvent("醘䎸꺪釹䨊ꥡ箠詝㬫홂⺄℥쑁Χ藼忹配ꢐ磜諚㪞헶⸀⇦잀˓蕢尞郑ꠃ", 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            onNavigationEvent("響꒚衛見鈋乘嵇剜僐ㅧࡥ屢꾡\ue485ꌑ螿爵侰席勛其㋓", (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr2);
            Object objInvoke = cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            if (objInvoke != null) {
                int i2 = getInterfaceDescriptor + 41;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                if (exoPlayerImplExternalSyntheticLambda27.onExtraCallbackWithResult()) {
                    int i4 = getInterfaceDescriptor;
                    int i5 = i4 + 71;
                    access100 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw new NullPointerException();
                    }
                    int i6 = i4 + 71;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr3 = new Object[1];
                        onExtraCallbackWithResult("\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼", 105 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, 22 - ImageFormat.getBitsPerPixel(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        onExtraCallbackWithResult("\n\u000e\u0001\ufffb�\r\u0006\ufffa\u0001\u0006￼￫�", 108 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, TextUtils.indexOf("", "", 0, 0) + 5, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, objArr4);
                        cls2.getMethod((String) objArr4[0], ServiceConnection.class).invoke(objInvoke, exoPlayerImplExternalSyntheticLambda27);
                        int i8 = access100 + 51;
                        getInterfaceDescriptor = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void onExtraCallbackWithResult(String str, int i, boolean z, int i2, int i3, Object[] objArr) {
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda2 utilExternalSyntheticLambda2 = new UtilExternalSyntheticLambda2();
        char[] cArr2 = new char[i3];
        utilExternalSyntheticLambda2.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
            utilExternalSyntheticLambda2.onNavigationEvent = cArr[utilExternalSyntheticLambda2.IAuthTabCallback];
            cArr2[utilExternalSyntheticLambda2.IAuthTabCallback] = (char) (utilExternalSyntheticLambda2.onNavigationEvent + i);
            int i4 = utilExternalSyntheticLambda2.IAuthTabCallback;
            cArr2[i4] = (char) (cArr2[i4] - ((int) (IAuthTabCallbackStub - 8081524258474968927L)));
            utilExternalSyntheticLambda2.IAuthTabCallback++;
        }
        if (i2 > 0) {
            utilExternalSyntheticLambda2.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult, utilExternalSyntheticLambda2.onExtraCallbackWithResult);
            System.arraycopy(cArr3, utilExternalSyntheticLambda2.onExtraCallbackWithResult, cArr2, 0, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            utilExternalSyntheticLambda2.IAuthTabCallback = 0;
            while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
                cArr4[utilExternalSyntheticLambda2.IAuthTabCallback] = cArr2[(i3 - utilExternalSyntheticLambda2.IAuthTabCallback) - 1];
                utilExternalSyntheticLambda2.IAuthTabCallback++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void IAuthTabCallback(String str, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 73;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw new NullPointerException();
        }
        char[] charArray = str == null ? str : str.toCharArray();
        AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException = new AssetDataSourceAssetDataSourceException();
        char[] cArr = new char[charArray.length];
        assetDataSourceAssetDataSourceException.onExtraCallback = 0;
        char[] cArr2 = new char[2];
        while (assetDataSourceAssetDataSourceException.onExtraCallback < charArray.length) {
            int i5 = IAuthTabCallbackStubProxy + 97;
            access000 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr2[0] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback];
                cArr2[0] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback];
                i2 = 1;
            } else {
                cArr2[0] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback];
                cArr2[1] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted - 3974139103868117988L)))) ^ ((c2 >>> 5) + ((char) (IAuthTabCallback - 3974139103868117988L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (onExtraCallback - 3974139103868117988L))) ^ ((c3 + i6) ^ ((c3 << 4) + ((char) (onNavigationEvent - 3974139103868117988L))))));
                i6 -= 40503;
                i2++;
            }
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback] = cArr2[0];
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback + 1] = cArr2[1];
            assetDataSourceAssetDataSourceException.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr, 0, i);
    }

    private static void onExtraCallbackWithResult(int i, String str, int[] iArr, String str2, Object[] objArr) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda1 utilExternalSyntheticLambda1 = new UtilExternalSyntheticLambda1();
        char[] cArr2 = onTransact;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (cArr2[i2] - 3038365681431118716L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (IAuthTabCallbackDefault - 3038365681431118716L);
        if (asInterface) {
            utilExternalSyntheticLambda1.onNavigationEvent = bArr.length;
            char[] cArr4 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
            utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
            while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                cArr4[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[bArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] + i] - i3);
                utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (asBinder) {
            utilExternalSyntheticLambda1.onNavigationEvent = cArr.length;
            char[] cArr5 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
            utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
            while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                cArr5[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[cArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i3);
                utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        utilExternalSyntheticLambda1.onNavigationEvent = iArr.length;
        char[] cArr6 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
        utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
        while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
            cArr6[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[iArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i3);
            utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onExtraCallback();
        onExtraCallbackWithResult = -2933473807052945553L;
        onNavigationEvent = (char) 15600;
        onExtraCallback = (char) 63962;
        onWarmupCompleted = (char) 43475;
        IAuthTabCallback = (char) 14672;
    }

    static void onExtraCallback() {
        IAuthTabCallbackStub = -837138589;
        onTransact = new char[]{33880, 33878, 33893, 33853, 33888, 33889, 33891, 33874, 33887, 33877, 33882, 33823, 33892, 33849, 33885, 33875, 33860, 33895, 33876};
        IAuthTabCallbackDefault = 1131447281;
        asBinder = true;
        asInterface = true;
    }
}
