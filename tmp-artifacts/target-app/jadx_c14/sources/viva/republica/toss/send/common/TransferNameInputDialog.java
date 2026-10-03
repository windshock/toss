package viva.republica.toss.send.common;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.M_;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.updateCertificate_SendConf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.send.common.TransferNameInputDialog$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferNameInputDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor = 0;
    private static long onTransact = -7036265618557616027L;
    private final Function1<String, Unit> IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String asBinder;
    private final String asInterface;
    private final Lazy onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final BaseActivity onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(TransferNameInputDialog transferNameInputDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(transferNameInputDialog, setDetectableSize);
        }
        onExtraCallbackWithResult(transferNameInputDialog, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(TransferNameInputDialog transferNameInputDialog, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(transferNameInputDialog, view);
        int i4 = IAuthTabCallback_Parcel + 83;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransferNameInputDialog(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super String, Unit> function1) {
        super(baseActivity, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = baseActivity;
        this.asBinder = str;
        this.IAuthTabCallbackDefault = str2;
        this.asInterface = str3;
        this.IAuthTabCallback = function1;
        this.onExtraCallback = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));
        this.onExtraCallbackWithResult = baseActivity.getWindow().getAttributes().softInputMode;
    }

    public static final /* synthetic */ updateCertificate_SendConf onExtraCallback(TransferNameInputDialog transferNameInputDialog) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            transferNameInputDialog.onExtraCallbackWithResult();
            throw null;
        }
        updateCertificate_SendConf updatecertificate_sendconfOnExtraCallbackWithResult = transferNameInputDialog.onExtraCallbackWithResult();
        int i3 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return updatecertificate_sendconfOnExtraCallbackWithResult;
    }

    private final updateCertificate_SendConf onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        updateCertificate_SendConf updatecertificate_sendconf = (updateCertificate_SendConf) this.onExtraCallback.getValue();
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return updatecertificate_sendconf;
    }

    public static final class IAuthTabCallback implements Function0<updateCertificate_SendConf> {
        final /* synthetic */ Dialog onNavigationEvent;

        public IAuthTabCallback(Dialog dialog) {
            this.onNavigationEvent = dialog;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final updateCertificate_SendConf invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return updateCertificate_SendConf.onExtraCallback(layoutInflater);
        }
    }

    private static final Unit onExtraCallbackWithResult(TransferNameInputDialog transferNameInputDialog, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{60805, 60913, 37225, 43625, 20051, 14581, 62252, 16763, 'D'}, ExpandableListView.getPackedPositionGroup(0L) + 1, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), transferNameInputDialog.asBinder);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onExtraCallbackWithResult(viva.republica.toss.send.common.TransferNameInputDialog r9, android.view.View r10) {
        /*
            r10 = 2
            int r0 = r10 % r10
            r1 = 1309161(0x13f9e9, double:6.468115E-318)
            r3 = 0
            r4 = 0
            r5 = 0
            viva.republica.toss.send.common.TransferNameInputDialog$$ExternalSyntheticLambda1 r6 = new viva.republica.toss.send.common.TransferNameInputDialog$$ExternalSyntheticLambda1
            r6.<init>(r9)
            r7 = 14
            r8 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r1, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r9.IAuthTabCallback
            o.updateCertificate_SendConf r1 = r9.onExtraCallbackWithResult()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.onExtraCallbackWithResult
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L37
            int r2 = viva.republica.toss.send.common.TransferNameInputDialog.getInterfaceDescriptor
            int r2 = r2 + 71
            int r3 = r2 % 128
            viva.republica.toss.send.common.TransferNameInputDialog.IAuthTabCallback_Parcel = r3
            int r2 = r2 % r10
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L37
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L39
        L37:
            java.lang.String r1 = ""
        L39:
            r0.invoke(r1)
            r9.dismiss()
            int r9 = viva.republica.toss.send.common.TransferNameInputDialog.getInterfaceDescriptor
            int r9 = r9 + 31
            int r0 = r9 % 128
            viva.republica.toss.send.common.TransferNameInputDialog.IAuthTabCallback_Parcel = r0
            int r9 = r9 % r10
            if (r9 == 0) goto L4b
            return
        L4b:
            r9 = 0
            r9.hashCode()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.common.TransferNameInputDialog.onExtraCallbackWithResult(viva.republica.toss.send.common.TransferNameInputDialog, android.view.View):void");
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        LinearLayout root = onExtraCallbackWithResult().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        setContentView(root);
        BottomSheetHeader bottomSheetHeader = onExtraCallbackWithResult().onExtraCallback;
        bottomSheetHeader.setTitle(this.asBinder);
        bottomSheetHeader.setDescription(this.IAuthTabCallbackDefault);
        boolean z = false;
        bottomSheetHeader.setShowCloseIcon(false);
        EditText editText = onExtraCallbackWithResult().onExtraCallbackWithResult.getEditText();
        if (editText != null) {
            int i4 = IAuthTabCallback_Parcel + 1;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                bottomSheetHeader.readTypedObject().setLabelFor(editText.getId());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bottomSheetHeader.readTypedObject().setLabelFor(editText.getId());
        }
        TextFieldLine textFieldLine = onExtraCallbackWithResult().onExtraCallbackWithResult;
        textFieldLine.setHint(this.asInterface);
        EditText editText2 = textFieldLine.getEditText();
        if (editText2 != null) {
            editText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
            editText2.addTextChangedListener(new onExtraCallback());
        }
        TdsButtonV1View tdsButtonV1ViewAsInterface = onExtraCallbackWithResult().onWarmupCompleted.asInterface();
        EditText editText3 = onExtraCallbackWithResult().onExtraCallbackWithResult.getEditText();
        if (editText3 != null) {
            int i5 = getInterfaceDescriptor + 1;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (editText3.getText() != null && (!StringsKt.isBlank(r2))) {
                int i7 = IAuthTabCallback_Parcel + 91;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            }
        }
        tdsButtonV1ViewAsInterface.setEnabled(z);
        onExtraCallbackWithResult().onWarmupCompleted.asInterface().setOnClickListener(new TransferNameInputDialog$.ExternalSyntheticLambda0(this));
        this.onNavigationEvent.getWindow().setSoftInputMode(16);
    }

    public static final class onExtraCallback implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onExtraCallback() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TdsButtonV1View tdsButtonV1ViewAsInterface = TransferNameInputDialog.onExtraCallback(TransferNameInputDialog.this).onWarmupCompleted.asInterface();
            boolean z = false;
            if (editable != null && (!StringsKt.isBlank(editable))) {
                z = true;
            }
            tdsButtonV1ViewAsInterface.setEnabled(z);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onTransact ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 117;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 53;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 45812), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 84, 21233 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - MotionEvent.axisFromString("")), 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public void dismiss() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.getTypedExportedConstants*/.dismiss();
        M_.onExtraCallback.onExtraCallback(onExtraCallbackWithResult().onExtraCallbackWithResult.getEditText());
        this.onNavigationEvent.getWindow().setSoftInputMode(this.onExtraCallbackWithResult);
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
