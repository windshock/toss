package viva.republica.toss.send.periodic;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CheckMask;
import o.ConvertByteArrayToFloatArray;
import o.ParamImpl;
import o.ResetInputBGRLivenessChecker;
import o.SetDetectableSize;
import o.TrackGroupExternalSyntheticLambda0;
import o.disableTextLayoutManagerCacheAndroid;
import o.fromArray;
import o.getLongName;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferConfirmDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static char[] asBinder = {27260, 27174, 27198, 27168, 27168, 27258, 27170, 27196, 27168, 27170, 27168, 27175, 27178, 27170, 27173, 27172, 27260, 27173, 27196, 27173, 27179, 27179, 27173, 27196};
    private static int getInterfaceDescriptor = 1;
    private final onExtraCallbackWithResult IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String asInterface;
    private final fromArray onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Date onTransact;

    public interface onExtraCallbackWithResult {
        void onExtraCallback();
    }

    public static /* synthetic */ Unit IAuthTabCallback(BottomSheetHeader bottomSheetHeader, TextView textView, PeriodicTransferConfirmDialog periodicTransferConfirmDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bottomSheetHeader, textView, periodicTransferConfirmDialog, setDetectableSize);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BottomSheetHeader bottomSheetHeader, TextView textView, PeriodicTransferConfirmDialog periodicTransferConfirmDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(bottomSheetHeader, textView, periodicTransferConfirmDialog, setDetectableSize);
        int i4 = access100 + 41;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(PeriodicTransferConfirmDialog periodicTransferConfirmDialog, BottomSheetHeader bottomSheetHeader, TextView textView, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(periodicTransferConfirmDialog, bottomSheetHeader, textView, view);
        int i4 = access100 + 9;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicTransferConfirmDialog(@NotNull Context context, @NotNull String str, long j, @NotNull Date date, @NotNull String str2, @NotNull fromArray fromarray, @Nullable String str3, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fromarray, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.asInterface = str;
        this.onExtraCallbackWithResult = j;
        this.onTransact = date;
        this.onNavigationEvent = str2;
        this.onExtraCallback = fromarray;
        this.IAuthTabCallbackDefault = str3;
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
            setContentView(R.layout.dialog_periodic_transfer_confirm);
            onWarmupCompleted();
            int i3 = getInterfaceDescriptor + 109;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setContentView(R.layout.dialog_periodic_transfer_confirm);
        onWarmupCompleted();
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(BottomSheetHeader bottomSheetHeader, TextView textView, PeriodicTransferConfirmDialog periodicTransferConfirmDialog, SetDetectableSize setDetectableSize) throws Throwable {
        CharSequence text;
        TextView typedObject;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        CharSequence text2 = null;
        if (bottomSheetHeader == null || (typedObject = bottomSheetHeader.readTypedObject()) == null) {
            int i2 = access100 + 11;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            text = null;
        } else {
            int i4 = getInterfaceDescriptor + 85;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            text = typedObject.getText();
        }
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 0, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), text);
        if (textView != null) {
            int i6 = access100 + 115;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                textView.getText();
                text2.hashCode();
                throw null;
            }
            text2 = textView.getText();
            int i7 = access100 + 89;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 11, 0, 6}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), text2);
        Object[] objArr3 = new Object[1];
        a(new int[]{16, 8, 0, 2}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 0}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), periodicTransferConfirmDialog.IAuthTabCallbackDefault);
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(PeriodicTransferConfirmDialog periodicTransferConfirmDialog, BottomSheetHeader bottomSheetHeader, TextView textView, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1294455L, false, (String) null, (Map) null, new PeriodicTransferConfirmDialog$.ExternalSyntheticLambda2(bottomSheetHeader, textView, periodicTransferConfirmDialog), 14, (Object) null);
        periodicTransferConfirmDialog.IAuthTabCallback.onExtraCallback();
        periodicTransferConfirmDialog.dismiss();
        int i2 = access100 + 1;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted() {
        int i;
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        int i2 = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.onTransact);
        Calendar calendar2 = Calendar.getInstance();
        int timeInMillis = (int) ((((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 1000) / 3600) / 24);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            i = 0;
        } else {
            int i3 = getInterfaceDescriptor + 29;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            i = 1;
        }
        int i5 = timeInMillis + i;
        BottomSheetHeader bottomSheetHeaderFindViewById = findViewById(R.id.header);
        if (bottomSheetHeaderFindViewById != null) {
            if (this.onExtraCallback == fromArray.ONE_TIME) {
                bottomSheetHeaderFindViewById.setTitle(bottomSheetHeaderFindViewById.getContext().getString(R.string.app_send_periodic___718668dc84, disableTextLayoutManagerCacheAndroid.onWarmupCompleted(Integer.valueOf(i5)), getLongName.onNavigationEvent(this.onExtraCallbackWithResult, (ParamImpl) null, 1, (Object) null)));
            } else {
                bottomSheetHeaderFindViewById.setTitle(bottomSheetHeaderFindViewById.getContext().getString(R.string.app_send_periodic___5ca2a7aa7c, disableTextLayoutManagerCacheAndroid.onWarmupCompleted(Integer.valueOf(i5))));
            }
            bottomSheetHeaderFindViewById.setShowCloseIcon(false);
        }
        TextView textView = (TextView) findViewById(R.id.message);
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            ResetInputBGRLivenessChecker resetInputBGRLivenessCheckerIAuthTabCallback = CheckMask.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback();
            Date date = this.onTransact;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            sb.append(ResetInputBGRLivenessChecker.onExtraCallback(resetInputBGRLivenessCheckerIAuthTabCallback, date, context, (TimeZone) null, 4, (Object) null));
            String str = this.asInterface;
            if (str.length() <= 0) {
                int i6 = access100 + 21;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                str = null;
            }
            String string = str != null ? getContext().getString(R.string.app_send_periodic___024eb61bbc, str) : null;
            if (this.onExtraCallback == fromArray.ONE_TIME) {
                sb.append(getContext().getString(R.string.app_send_periodic___735c1e670f));
                sb.append(string);
            } else {
                sb.append(getContext().getString(R.string.app_send_periodic___04474d2d75));
                sb.append(this.onNavigationEvent);
                sb.append(string);
            }
            sb.append(getContext().getString(R.string.app_send_periodic___9e15168d83, getLongName.onNavigationEvent(this.onExtraCallbackWithResult, (ParamImpl) null, 1, (Object) null)));
            textView.setText(sb.toString());
        }
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = findViewById(R.id.bottomCta);
        if (tdsBottomCtaV1ViewFindViewById != null && (tdsButtonV1ViewAsInterface = tdsBottomCtaV1ViewFindViewById.asInterface()) != null) {
            tdsButtonV1ViewAsInterface.setOnClickListener(new PeriodicTransferConfirmDialog$.ExternalSyntheticLambda0(this, bottomSheetHeaderFindViewById, textView));
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1294453L, false, (String) null, (Map) null, new PeriodicTransferConfirmDialog$.ExternalSyntheticLambda1(bottomSheetHeaderFindViewById, textView, this), 14, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(im.toss.uikit.widget.dialog.BottomSheetHeader r8, android.widget.TextView r9, viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog r10, o.SetDetectableSize r11) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            r1 = 0
            if (r8 == 0) goto L28
            int r2 = viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog.access100
            int r2 = r2 + 45
            int r3 = r2 % 128
            viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog.getInterfaceDescriptor = r3
            int r2 = r2 % r0
            android.widget.TextView r8 = r8.readTypedObject()
            if (r8 == 0) goto L28
            int r2 = viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog.getInterfaceDescriptor
            int r2 = r2 + 71
            int r3 = r2 % 128
            viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog.access100 = r3
            int r2 = r2 % r0
            java.lang.CharSequence r8 = r8.getText()
            goto L29
        L28:
            r8 = r1
        L29:
            r2 = 0
            r3 = 5
            int[] r4 = new int[]{r2, r3, r2, r2}
            byte[] r5 = new byte[r3]
            r5 = {x0092: FILL_ARRAY_DATA , data: [1, 1, 0, 1, 1} // fill-array
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            a(r4, r6, r5, r7)
            r4 = r7[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            r11.onExtraCallback(r4, r8)
            if (r9 == 0) goto L54
            int r8 = viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog.access100
            int r8 = r8 + 39
            int r1 = r8 % 128
            viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog.getInterfaceDescriptor = r1
            int r8 = r8 % r0
            java.lang.CharSequence r1 = r9.getText()
        L54:
            r8 = 6
            r9 = 11
            int[] r8 = new int[]{r3, r9, r2, r8}
            byte[] r9 = new byte[r9]
            r9 = {x009a: FILL_ARRAY_DATA , data: [1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1} // fill-array
            java.lang.Object[] r3 = new java.lang.Object[r6]
            a(r8, r2, r9, r3)
            r8 = r3[r2]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            r11.onExtraCallback(r8, r1)
            r8 = 16
            r9 = 8
            int[] r8 = new int[]{r8, r9, r2, r0}
            byte[] r9 = new byte[r9]
            r9 = {x00a4: FILL_ARRAY_DATA , data: [1, 1, 0, 1, 1, 1, 1, 0} // fill-array
            java.lang.Object[] r0 = new java.lang.Object[r6]
            a(r8, r2, r9, r0)
            r8 = r0[r2]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            java.lang.String r9 = r10.IAuthTabCallbackDefault
            r11.onExtraCallback(r8, r9)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog.onExtraCallback(im.toss.uikit.widget.dialog.BottomSheetHeader, android.widget.TextView, viva.republica.toss.send.periodic.PeriodicTransferConfirmDialog, o.SetDetectableSize):kotlin.Unit");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        char c = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = asBinder;
        long j = 0;
        if (cArr3 != null) {
            int i7 = $11 + 93;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr3[i]);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 35283), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 34, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                    c = 0;
                    j = 0;
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                if (i8 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 10935), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 64, 16718 - View.resolveSizeAndState(0, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - KeyEvent.keyCodeFromString("")), Color.red(0) + 70, KeyEvent.normalizeMetaState(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i11, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i11);
        }
        if (z) {
            int i12 = $11 + 49;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i13 = $10 + 3;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i15 = 0;
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i15;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i4) {
                    break;
                }
                int i16 = $11 + 123;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
